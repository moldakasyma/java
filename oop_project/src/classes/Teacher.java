package classes;
import java.io.Serializable;
import java.util.*;
import classes.*;
import enums.*;


/**
* @generated
*/
public class Teacher extends Employee implements Comparable, Serializable {
    
   
	private Vector<Course> courses = new Vector<Course>();
	private double rate;
    private TeacherType teacherType;
    private Vector<Student> students;
    private Vector<Lesson> lessons;
    private Vector<Files> file;
 
    private Course course;

    public Vector<Course> getCourses() {
        return courses;
    }
 
    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }
   
    public double getRate() {
        return rate;
    }
   
    public double setRate(double rate) {
        this.rate = rate;
    }
    
    public TeacherType getTeacherType() {
        return teacherType;
    }
  
    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }
    
   
 
    private Vector<Files> getFile() {
        return file;
    }
  
    private Vector<Files> setFile(Vector<Files> file) {
        this.file = file;
    }

 
    public void putMarks (studens_id:int,mark:double)() {
        //TODO
    }
    
    /**
    * @generated
    */
    public int viewMark(String courseName) {
    	if(this.equals(courseName)==true) {
    		for(Course c:Database.courses) {
    			if(c.getCourseName().equals(courseName)) {
    				Course course=c;
    				
    			}
    		}
    	}
        //TODO
        return 0;
    }
    
    /**
    * @generated
    */
    public UrgancyLevel sentComplaint() {
        //TODO
        return OOP.UrgancyLevel.LOW;
    }
    
    /**
    * @generated
    */
    public markReport makeMarkReport() {
        //TODO
        return null;
    }

	public void addCourse(Course course2) {
		// TODO Auto-generated method stub
		
	}
    
    
}
