package lab1;

import java.util.Scanner;

public class Analyzer {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Data data=new Data();
		while(true) {
			System.out.println("Enter number(Q to quit): ");
			if(scan.hasNextDouble()) {
				double num=scan.nextDouble();
				data.addData(num);
			}
			else {
				String input=scan.next();
				if(input.equalsIgnoreCase("Q")) {
				break;
			}
		}
		}
		double Average=data.getAverage();
		double Maximum=data.getMaximum();
		System.out.println(Average);
		System.out.println(Maximum);
		scan.close();
		
	}

}
