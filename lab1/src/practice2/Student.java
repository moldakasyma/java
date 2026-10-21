package practice2;

import java.util.Vector;

public class Student {
	 String name;
	 int id;
	 int study_year;
	 Vector <Integer> grades;
	 
	 public Student(String name) {
	  this.name=name;
	  
	 }
	 public Student(String name,int id) {
		 this(name);
		 this.id=id;
		 this.grades=new Vector<>();
		 
	  
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	public void addGrade(int grade) {
		 grades.add(grade);
	 }
	 
	 public String getName() {
	  return name;
	 }
	 public int getId() {
	  return id;
	 }
	 public int getYear() {
	  return study_year;
	 }
	 
	 public Vector<Integer>getGrades(){
		 return grades;
	 }
	 public String toString() {
		 return "Student"+this.name+" : ";


}
}
