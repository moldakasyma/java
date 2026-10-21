package task1;

public abstract class Animal  {
	//use interface when you want to  specify the behavior of a particular data type, but not concerned about who implements its behavior.
	//And when unrelated class implement the same interface
	//use abstract class when you want to share code with closely related classes.
	int age;
	public Animal(int age) {
		this.age=age;
	}
	
	abstract void eat();
	public String toString() {
		return age+" ";
	}
	
	

}
