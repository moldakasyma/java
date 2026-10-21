package task4;

import java.util.Comparator;

public class DateComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getHireDate().compareTo(o2.getHireDate());
	}
	
	

}
