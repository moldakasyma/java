package task4;

import java.util.*;


public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee e=new Employee("Aliya",500000.0,new Date(11/6/2020),"A");
		Employee e2=new Employee("Elya",320000.0,new Date(5/6/2022),"A");
		Vector<Employee>team=new Vector<Employee>();
		team.add(e);
		team.add(e2);
		team.add(new Employee("Daniyar",500000.0,new Date(2/5/2020),"B"));
		team.add(new Employee("Symbat",580000.0,new Date(28/02/2019),"C"));
		Manager m=new Manager("Alan",430000.0,new Date(3/9/2020),"D",50000.5);
		Manager m2=new Manager("Zhanel",600000.0,new Date(2/7/2019),"E",10000.0);
		team.add(m2);
		team.add(m);
		
		Collections.sort(team,new NameComparator());
		Collections.sort(team,new DateComparator());
		for(Employee em:team) {
			System.out.println(em);
			
		}

		Employee copy1=e;
		copy1.name="Alima";
		System.out.println("Object: "+e);
		System.out.println("Clone: "+copy1+"\n");
		
		Manager copy2=m;	
		copy2.name="Alua";
		System.out.println("Object: "+m);
		System.out.println("Copy: "+copy2+"\n");
		
	
		
		
		if(e.compareTo(e2)==0) {
			System.out.println("They are equal!");
			
			
		}
		else if(e.compareTo(e2)==-1) {
			System.out.println("First employee's salary is more");
			
		}
		else {
			System.out.println("Second employee's salary is more");
		}
		if(m.compareTo(m2)==0) {
			System.out.println("They are equal!");
			
			
		}
		else if(m.compareTo(m2)==-1) {
			System.out.println("First employee got more bonus ");
			
		}
		else {
			System.out.println("Second employee got more bonus");
		}

		System.out.println(e.equals(e2));
		System.out.println(m.equals(m2));
		
		
		
	
	}

}
