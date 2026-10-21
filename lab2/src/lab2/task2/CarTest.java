package lab2.task2;

import java.util.HashSet;
import java.util.Objects;

public class CarTest {

	public static void main(String[] args) {
		HashSet<Vehicle> hs=new HashSet<Vehicle>();
		Vehicle vehicle=new Vehicle("Yacht",2020);
		Vehicle vehicle1=new Vehicle("Bicycle",2022);
		Vehicle vehicle2=new Vehicle("Bicycle",2022);
		
		System.out.println(vehicle.equals(vehicle1));
		Car car=new Car("car",2020,"Toyota");
		Car car1=new Car("car",2022,"Lexus");
				
		
		hs.add(vehicle);
		hs.add(vehicle1);
		hs.add(car);
		hs.add(car1);
		hs.add(vehicle2);
		System.out.println(hs);
			
	
		
		

	}

}
