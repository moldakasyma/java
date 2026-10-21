package task1;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius: ");
		Double radius=scan.nextDouble();
		
		System.out.println("Enter height: ");
		Double height=scan.nextDouble();
		System.out.println("Enter side: ");
		int side=scan.nextInt();
		
		
		
		Cylinder cylinder=new Cylinder(radius,height);
		Sphere sphere=new Sphere(radius);
		Cube cube=new Cube(side);
		shapeInfo(cylinder);
		System.out.println("\n");
		shapeInfo(sphere);
		System.out.println("\n");
		shapeInfo(cube);
		System.out.println("\n");
	}
		public static void shapeInfo(Shape shape) {
			System.out.println("Shape type: "+shape.getType());
			System.out.println("Shape volume: "+shape.volume());
			System.out.println("Shape surface area: "+shape.surfaceArea());
		
		}
		
		
		

	}


