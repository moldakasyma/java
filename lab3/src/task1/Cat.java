package task1;

public class Cat extends Animal implements MakeVoice {
	String name;
	public Cat(int age,String name) {
		super(age);
		this.name=name;	
	}
	void eat() {
		System.out.println("Cat is eating pizza!");
	}
	public void voice() {
		System.out.println("meow-meow");
	}

}
