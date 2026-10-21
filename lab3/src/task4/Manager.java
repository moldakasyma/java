package task4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Cloneable{
	Vector<Employee>team=new Vector<Employee>();
	private double bonus;
	public Manager(String name,double salary,Date hireDate,String insuranceNumber,double bonus) {
		super(name,salary,hireDate,insuranceNumber);
		this.bonus=bonus;
	}
	public Vector<Employee> getTeam() {
		return team;
	}
	public void setTeam(Vector<Employee> team) {
		this.team = team;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void addTeam(Employee e) {
		team.add(e);
	}
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		Manager manager=(Manager)o;
		return super.equals(manager) && this.bonus==manager.bonus && this.team.equals(manager.team);
			
	}
	public int hashCode() {
		return Objects.hash(bonus,team);
	}
	public int compareTo(Object o) {
		if(o instanceof Manager && super.compareTo(o)==0) {
			Manager m=(Manager)o;
			if(this.bonus>m.bonus) {
				return 1;
			}
			if(this.bonus<m.bonus) {
				return -1;
			}
		}
		return super.compareTo(o);
	}
	public Object clone() throws CloneNotSupportedException {
		Manager manag=(Manager)super.clone();
		manag.team=(Vector<Employee>)team.clone();
		return manag;
	}
	public String toString() {
		
		return super.toString()+" "+"bonus: "+bonus;
	}

}
