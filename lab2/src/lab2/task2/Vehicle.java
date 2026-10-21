package lab2.task2;

import java.util.Objects;

public  class Vehicle {
	String type;
	int year;
	public Vehicle(String type,int year) {
		this.type=type;
		this.year=year;
		
	}
	void honk() {
		System.out.println("Tu-Tu");
	}

	
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(getClass()!=o.getClass()) {
			return false;
		}
		Vehicle vehicle=(Vehicle) o ;
		return year==vehicle.year && this.type.equals(vehicle.type);
	}
	public int hashCode() {
		return Objects.hash(type,year);
	}
	public String toString() {
		return type+" "+year;
	}
	

}
