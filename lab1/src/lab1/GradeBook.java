package lab1;
import java.util.Vector;

import practice2.Student;

public class GradeBook {
	Course course;
	Vector<Student>students;
	public GradeBook(Course course) {
		this.course=course;
		students=new Vector<Student>();
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public void displayMessage() {
		System.out.println("Welcome to the grade book for"+" "+course.toString()+"!");
		System.out.println("Please, input grades for studenys: ");
	}
	
	
	public void displayGradeReport() {
		double total=0;
		int lowGrade=Integer.MAX_VALUE;
		int highGrade=Integer.MIN_VALUE;
		Student highGradeStudent=null;
		Student lowGradeStudent=null;
		for(int i=0; i<students.size(); i++) {
			Student student=students.get(i);
			int average=determineClassAverage(student);
			total+=average;
			if(average<lowGrade) {
				lowGrade=average;
				lowGradeStudent=student;
			}
			if(average>highGrade) {
				highGrade=average;
				highGradeStudent=student;
			}
			
		}
		double classAverage=total/students.size();
		System.out.printf("Class average is %.2f.Lowest grade is %d (Student %s,id:%d). Highest grade is %d (Student %s,id:%d).\n",classAverage,lowGrade,lowGradeStudent.getName(),lowGradeStudent.getId(),highGrade,highGradeStudent.getName(),highGradeStudent.getId());
		}
	private int determineClassAverage(Student student) {
		if(student.getGrades().isEmpty()) {
			return 0;
		}
			int sum=0;
			for(Integer grade: student.getGrades()) {
				sum+=grade;
			}
			return sum/student.getGrades().size();
		}
		
		public void outputBarChart() {
			int [] gradeRanges=new int[11];
			for(Student student:students) {
				for(int grade: student.getGrades()) {
					if(grade>=0 && grade<=9) {
						gradeRanges[0]++;
					}
					else if(grade>=10 && grade<=19) {
						gradeRanges[1]++;
					}
					else if(grade>=20 && grade<=29) {
						gradeRanges[2]++;
					}
					else if(grade>=30 && grade<=39) {
						gradeRanges[3]++;
					}
					else if(grade>=40 && grade<=49) {
						gradeRanges[4]++;
					}
					else if(grade>=50 && grade<=59) {
						gradeRanges[5]++;
					}
					else if(grade>=60 && grade<=69) {
						gradeRanges[6]++;
					}
					else if(grade>=70 && grade<=79) {
						gradeRanges[7]++;
					}
					else if(grade>=80 && grade<=89) {
						gradeRanges[8]++;
					}
					else if(grade==90 && grade<=99) {
						gradeRanges[9]++;
					}
					else if(grade==100 ) {
						gradeRanges[10]++;
					}
					
				}
			}
			String [] range= {"0-9: ","10-19: ","20-29: ","30-39: ","40-49: ","50-59: ","60-69: ","70-79: ","80-89: ","90-99: ","100: "};
			System.out.println("Gradebook distribution: ");
			for(int i=0; i<range.length;i++) {
				System.out.print(range[i]);
				int num=gradeRanges[i];
				for(int j=0; j<num; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
	}
		
		
}
