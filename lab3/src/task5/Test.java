package task5;
import java.util.*;

import practice2.Time;
import task4.Employee;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate ch1=new Chocolate(0.42,"Snickers");
		Chocolate ch2=new Chocolate(0.40,"Albeni");
		Chocolate ch3=new Chocolate(0.37,"Kinder Bueno");
		Time t1=new Time(14,25,50);
		Time t2=new Time(20,30,10);
		Time t3=new Time(10,9,30);
		Employee e1=new Employee("Aliya",500000.0,new Date(11/6/2020),"A");
		Employee e2=new Employee("Elya",320000.0,new Date(5/6/2022),"A");
		Employee e3=new Employee("Daniyar",500000.0,new Date(2/5/2020),"B");
		Chocolate [] chocolate=new Chocolate[] {ch1,ch2,ch3};
		Time [] time=new Time[] {t1,t2,t3};
		Employee[] employee=new Employee[] {e1,e2,e3};
		Sort.BubbleSort(chocolate);
		for(Chocolate c:chocolate) {
			System.out.println(c);
		}
		
		Sort.BubbleSort(time);
		for(Time t:time) {
			System.out.println(t);
		}
		Sort.BubbleSort(employee);
		for(Employee e:employee) {
			System.out.println(e);
		}
		Sort.QuickSort(chocolate, 0, chocolate.length-1);
		for(Chocolate c:chocolate) {
			System.out.println(c);
		}
		Sort.QuickSort(time, 0, time.length-1);
		for(Time t:time) {
			System.out.println(t);
		}
		Sort.QuickSort(employee, 0, employee.length-1);
		for(Employee e:employee) {
			System.out.println(e);
		}
		
		
	}

}
