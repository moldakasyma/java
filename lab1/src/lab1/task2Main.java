package lab1;

import java.util.Scanner;

public class task2Main {

	public static void main(String[] args) {
		task2.cinema("Barbie");
	    task2.cinema("Openheimer", 2023);
	    task2.cinema("The nun 2", Genre.horror);
		Scanner scan=new Scanner(System.in);
		System.out.print("Name: ");
		String name1=scan.nextLine();
		System.out.print("Year: ");
		int year1=scan.nextInt();
		task2 movie1=new task2(name1,year1);
		
		Scanner scan2=new Scanner(System.in);
		System.out.print("Name: ");
		String name2=scan2.nextLine();
		System.out.print("Year: ");
		int year2=scan2.nextInt();
		
		task2 movie2=new task2(name2,year2);
		System.out.println("Genre: " +movie2.genre.comedy);
		
		
	    System.out.println("Ticket Sales: " + movie1.getTicketCount());

	  
	    scan.close();
	    scan2.close();
	}

}
