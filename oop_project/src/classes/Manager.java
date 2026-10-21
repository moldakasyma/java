package classes;

import java.io.Serializable;
import enums.*;

import classes.*;
import java.util.*;
/**
* @generated
*/
public class Manager extends Employee implements ManageNews,Serializable {
    
    private int employeeId;
    private String email;
    private String department;
    private ManagerType type;

    
    public Manager(int employeeId,String email,String department,ManagerType type) {
    	super(name,employeeId,position,salary);
    	this.type=type;
    }
  
    public Integer getEmployeeId() {
        return this.employeeId;
    }
 
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
  
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getDepartment() {
        return this.department;
    }
  
    public void setDepartment(String department) {
        this.department = department;
    }
  
    public ManagerType getType() {
        return this.type;
    }
  
    public void setType(ManagerType type) {
        this.type = type;
    }
    public void viewRequest() {
        //TODO
    	for(Request r: Database.requests) {
    		if(r.getType().equals(RequestType.COURSEREGISTRATION)) {
    			System.out.println(r.getForm()+" | "+r.getApproved()+" | ");
    		}
    	}
    }

    public boolean approveStudentRegistration(Student s,Course c) {
    	for(Request r:Database.requests) {
    		if(r.getType().equals(RequestType.COURSEREGISTRATION)) {
    			if(Status.APPROVED != null) {
    				return true;
    			}
    			
    			
    		}
    	}
    	if(s.getCredit()+c.getCredits()>30){
    		return false;
    	}
		return false;
    }
    public void createCourse( int courseId,String name,int credit,Semester semester,Faculty faculty) {
    	Course a=new Course(courseId,name,credit,semester,faculty);
    	for(Course c:Database.courses) {
    		if(!c.getCourseId().equals(courseId)){
    			Database.courses.add(c);
    			Database.save();
    			System.out.println("Course has created succesfully");
    		}
    	
    }

    
 
    public void addCourse(int id,String courseName) {
        //TODO
    	for(User u:Database.users) {
    		if(u instanceof Student) {
    			if(u.getId().equals(id)) {
    				((Student)u).registerToCourse(courseName);
    				System.out.println("Succesfully registrated");
    			}
    		}
    	}
    	
    }
    
  
    public void dropCourse(int id,String courseName) {
        //TODO
    	for(User u:Database.users) {
    		if(u instanceof Student) {
    			if(u.getId().equals(id)) {
    				((Student)u).dropCourse(courseName);
    				System.out.println("Dropped course");
    			}
    		}
    	}
    }
   
    public void assignCourseForTeacher(String login, String courseName) {
        //TODO
    	Course course = null;
    	Teacher teacher = null;
    	for(Course c:Database.courses) {
    		if(c.getCourseName().equals(courseName)) {
    			course=c;
    		}
    	}
    	for(User u:Database.users) {
    		if( u instanceof Teacher) {
    			teacher=(Teacher)u;
    			
    		}
    	}
    	teacher.addCourse(course);
       
    }
  
    public void viewAllCourse() {
       Database.courses.stream().forEach(x->System.out.println(x.getInfo()));
    }
    
    public String viewTranscript(int id) {
    	for(User u: Database.users) {
    		if(u instanceof Student) {
    			Student s=(Student)u;
    			if(s.getId().equals(id)) {
    				return s.viewTranscript();
    			}
    		}
    	}
		return null;
    	
    }
    public void orderStudentByName() {
    	Comparator<User>sortingName=new NameSorter();
    	
		Database.users.stream().
    	sorted(sortingName).
    	filter(n->n instanceof Student).
    	map(n->(Student)n.getName()+" "+n.getId());
    	
    }
    public void orderByGpa() {
    	Database.users.stream().
    	filter(n->n instanceof Student).
    	map(n->(Student)n.sorted(Comparator.reverseOrder().forEach(n->System.out.println(n.getName+" "+n.getId+" "+n.getGPA()))));
    }
  

	@Override
	public void createNews(String text) {
		// TODO Auto-generated method stub
		News n=new News(text);
		Database.news.add(n);
		Database.save();
		
	}

	@Override
	public void updateNews(String text) {
		// TODO Auto-generated method stub
		System.out.println("Updating news");
		Database.save();
		
		
	}

	@Override
	public void deleteNews(String text) {
		// TODO Auto-generated method stub
		 Database.news.removeIf(news -> news.getTitle().equals(text));
		 Database.save();
		
		 
	}
	public String viewStudentInfo(Student s) throws StudentNotFoundException{
		try {
			if(Database.)
		}
			if(Database.getDatabase().getStudents().contains(s)) {
				return s.toString();
			}
			else {
				throw new StudentNotFoundException("No such student in university database!");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return "";
	}

    
    
}
