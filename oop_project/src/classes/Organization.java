package classes;

import java.io.Serializable;
import java.util.*;
import classes.*;
public class Organization implements Serializable{
	private String nameOrganization;
	private Student headOrganization;
	private Vector<Student>members;
	public Organization(String name,Student student) {
		this.nameOrganization=name;
		this.headOrganization=student;
		
	}
	public String getNameOrganization() {
		return nameOrganization;
	}
	public void setNameOrganization(String nameOrganization) {
		this.nameOrganization=nameOrganization;
		
	}
	public Student getHeadOrganization() {
		return headOrganization;
	}
	public void setHeadOrganization(Student headOrganization) {
		this.headOrganization=headOrganization;
		
	}
	public Vector<Student>getMembers(){
		return members;
	}
	public void setMembers(Vector<Student>members) {
		this.members=members;
	}
	public void addStudent(Student s) {
		members.add(s);
	}
	public void removeStudent(Student s) {
		if(members.isEmpty()==false) {
			if(members.contains(s)) {
				members.remove(s);
				System.out.println(s.getName()+" was removed");
			}
			else {
				System.out.println("Base is empty");
			}
		}
	}
	public static String announce() {

		return "Announcement";
		
	}
}
