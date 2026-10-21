package task1;

public class Cylinder extends Shape {
	double radius;
	double height;
	
	public Cylinder(double radius,double height) {
		this.radius=radius;
		this.height=height;
	}
	
	public double volume() {
		return Math.PI*(radius*radius)*height;
		
	}
	public double surfaceArea() {
		return ((2*Math.PI*radius*height)+(2*Math.PI*(radius*radius)));
		
	}
	public String getType() {
		return "Cylinder";
	}
}
