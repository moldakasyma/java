package task4;


import java.util.Date;
import java.util.Objects;



public class Employee extends Person implements Comparable,Cloneable{
	private double salary;
	Date hireDate;
	private String insuranceNumber;
	public Employee(String name,double salary,Date hireDate,String insuranceNumber) {
		super(name);
		this.salary=salary;
		this.hireDate=hireDate;
		this.insuranceNumber=insuranceNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public boolean equals(Object o) {
		if(!super.equals(o)) {
			return false;
		}
		Employee employee=(Employee)o;
		return this.salary==employee.salary && this.hireDate==employee.hireDate && this.insuranceNumber.equals(employee.insuranceNumber);
			
	}
	public int hashCode() {
		return Objects.hash(salary,hireDate,insuranceNumber);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee empl=(Employee)o;
		if(this.salary>empl.salary) {
			return 1;
		}
		if(this.salary<empl.salary) {
			return -1;
		}
		return 0;
		
	}

	
	public Object clone() throws CloneNotSupportedException {
		Employee e=(Employee)super.clone();
		return e;
	}
	public String toString() {
		return super.toString()+" "+"Salary: "+salary+" "+"Hire Date: "+hireDate+" "+"Insurance number: "+insuranceNumber;
	}
	
	

}
