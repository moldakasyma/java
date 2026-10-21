package lab1;

public class DragonMain {

	public static void main(String[] args) {
		DragonLaunch dragon=new DragonLaunch();
		Person b=new Person(Gender.BOY);
		Person g=new Person(Gender.GIRL);
		
		dragon.kidnap(b);
		dragon.kidnap(b);
		dragon.kidnap(g);
		dragon.kidnap(g);
		dragon.remover();
		if(dragon.willDragonEatOrNot()) {
			System.out.println("Dragon will eat"+" "+dragon.lunch()+" "+"person for a lunch");
		}
		else {
			System.out.println("Dragon will not eat");
		}
		
		
		

	}

}
