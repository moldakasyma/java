package lab1;

import java.util.Scanner;
import practice2.Student;

public class GradeBookTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String prerequisite=scan.nextLine();
		String name=scan.nextLine();
		Course course=new Course(prerequisite,name);
		GradeBook gradeBook=new GradeBook(course);
		Student student1=new Student("A",1);
		Student student2=new Student("B",2);
		gradeBook.addStudent(student1);
		gradeBook.addStudent(student2);
		gradeBook.displayMessage();
		inputGrades(gradeBook);
		gradeBook.displayGradeReport();
		gradeBook.outputBarChart();
		
	}
	public static void inputGrades(GradeBook gradebook) {
		Scanner input=new Scanner(System.in);
		for(Student student:gradebook.students) {
			System.out.print(student.toString());
			String gradeInput=input.nextLine();
			String[] gradeStr=gradeInput.split(" ");
			for(String grade:gradeStr) {
				int gr=Integer.parseInt(grade);
				student.addGrade(gr);
				
			}
			
		}
		
	}
	
	

}
