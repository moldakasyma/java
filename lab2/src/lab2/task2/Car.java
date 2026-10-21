package lab2.task2;

public class Car extends Vehicle {
	String modelName;
	public Car(String type,int year,String modelName) {
		super(type,year);
		this.modelName=modelName;
	}
	
	public void honk() {
		super.honk();
		System.out.println("Bip-Bip");
	}
	
	public String toString() {
		return super.toString()+" "+modelName;
	}
	
	

}
