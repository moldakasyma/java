package lab1;

import java.util.Vector;

public class DragonLaunch {
	Gender gender;
	Vector<Person>kidnappedPerson;
	public DragonLaunch() {
		kidnappedPerson = new Vector<>();
	}
	public void kidnap(Person p) {
		kidnappedPerson.add(p);
	}
	public void remover() {
		
		for(int i=0; i<kidnappedPerson.size()-1; i++) {
			if(kidnappedPerson.get(i).toString().equals("BOY")&&kidnappedPerson.get(i+1).toString().equals("GIRL")) {
				kidnappedPerson.remove(i);
				kidnappedPerson.remove(i);
				
				i=-1;
			}
			
		}
	}
	public boolean willDragonEatOrNot() {
		if(kidnappedPerson.isEmpty()) {
			return false;
		}
		return true;
		
		
	}
	public int  lunch() {
		if(!kidnappedPerson.isEmpty()) {
			return kidnappedPerson.size();
		}
		return 0;
	}
	

	}

	

