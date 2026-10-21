
package classes;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

import classes.*;



public class Database implements Serializable {
	public static Vector<User>users=new Vector<User>();
	public static Vector<Course>courses=new Vector<Course>();
	public static Vector<Request>requests=new Vector<Request>();
	public static HashMap<Student,HashMap<Course,Mark>>marks;
	public static Vector<Organization>organizations=new Vector<Organixation>();
	public static Vector<News>news=new Vector<News>();
	public static Vector<Message>messages=new Vector<Message>();

	public static void read() {
		readUsers();
		readCourses();
		readRequests();
		readOrganizations();
		readNews();
		readMessages();
	}
	
	public static void save() {
		saveUsers();
		saveCourses();
		saveRequests();
		saveOrganizations();
		saveNews();
		saveMessages();
	}
	
	private static void saveUsers() {
		try {
			FileOutputStream fileOut=new FileOutputStream("users.txt");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(users);
			out.flush();
			out.close();
			fileOut.close();
		}
		catch(IOException e) {
			System.err.println("users.txt: IOException");
		}
	}
	
	private static void readUsers() {
		try {
			FileInputStream fis=new FileInputStream("users.txt");
			ObjectInputStream oin=new ObjectInputStream(fis);
			users=(Vector<User>)oin.readObject();
			oin.close();
			fis.close();
		}
		catch(UserNotFoundException e) {
			users=new Vector<>();
			System.err.println("users.txt: UserNouFoundException");
			
		}
	}
	private static void saveCourses() {
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("courses.txt"));
			out.writeObject(courses);
			out.flush();
			out.close();
			
		}
		catch(IOException e) {
			System.err.println("courses.txt: IOException");
		}
	}
	
	private static void readCourses() {
		try {
			FileInputStream fis=new FileInputStream("courses.txt");
			ObjectInputStream oin=new ObjectInputStream(fis);
			courses=(Vector<Course>)oin.readObject();
			oin.close();
			fis.close();
		}
		catch(ClassNotFoundException e) {
			courses=new Vector<>();
			System.err.println("courses.txt: ClassNotFoundException");
		}
		catch(IOException e){
			courses=new Vector<>();
			System.err.println("courses.txt:IOException");
		}
		
	}
	
	private static void saveRequests() {
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("courses.txt"));
			out.writeObject(requests);
			out.flush();
			out.close();
			
			
		}
		catch(IOException e) {
			System.err.println("requests.txt: IOException");
		}
		
	}
	private static void readRequests() {
		try {
		
			FileInputStream fis=new FileInputStream("requests.txt");
			ObjectInputStream oin=new ObjectInputStream(fis);
			requests=(Vector<Request>)oin.readObject();
			oin.close();
			fis.close();
		}
		catch(IOException e) {
			requests=new Vector<>();
			System.err.println("requests.txt:IOException");
		}
		catch(NoSuchRequestException e) {
			requests=new Vector<>();
			System.err.println("requests.txt:NoSuchRequestException");
		}
	}

	
	private static void saveOrganizations() {
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("organizations.txt"));
			out.writeObject(organizations);
			out.flush();
			out.close();
		}
		catch(IOException e){
			System.err.println("organizations.txt: IOException");
		}
	}
	
	private static void readOrganizations() {
		try {
			
			FileInputStream fis=new FileInputStream("organizations.txt");
			ObjectInputStream oin=new ObjectInputStream(fis);
			organizations=(Vector<Organization>)oin.readObject();
			oin.close();
			fis.close();
		}
		catch(IOException e) {
			organizations=new Vector<>();
			System.err.println("organizations.txt:IOException");
		}
		catch(ClassNotFoundException e) {
			organizations=new Vector<>();
			System.err.println("organizations.txt:ClassNotFoundException");
		}
		
	}
	
	private static void saveNews() {
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("news.txt"));
			out.writeObject(news);
			out.flush();
			out.close();
		}
		catch(IOException e){
			System.err.println("news.txt: IOException");
		}
	}
	private static void readNews() {
		try {
			
			FileInputStream fis=new FileInputStream("news.txt");
			ObjectInputStream oin=new ObjectInputStream(fis);
			news=(Vector<News>)oin.readObject();
			oin.close();
			fis.close();
		}
		catch(IOException e) {
			news=new Vector<>();
			System.err.println("news.txt:IOException");
		}
		catch(ClassNotFoundException e) {
			news=new Vector<>();
			System.err.println("news.txt:ClassNotFoundException");
		}
	}
	
	private static void saveMessages() {
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("messages.txt"));
			out.writeObject(messages);
			out.flush();
			out.close();
		}
		catch(IOException e){
			System.err.println("messages.txt: IOException");
		}
	}
	
	private static void readMessages() {
		try {
			
			FileInputStream fis=new FileInputStream("messages.txt");
			ObjectInputStream oin=new ObjectInputStream(fis);
			messages=(Vector<Message>)oin.readObject();
			oin.close();
			fis.close();
		}
		catch(IOException e) {
			messages=new Vector<>();
			System.err.println("messages.txt:IOException");
		}
		catch(ClassNotFoundException e) {
			messages=new Vector<>();
			System.err.println("messages.txt:ClassNotFoundException");
		}
	}
	
	private List<Student> getStudents() {
		return this.users.stream().filter(u->u instanceof Student).map(u->(Student)u).collect(Collectors.toList());
	}
	private List<Employee>getEmployee(){
		return this.users.stream().filter(u->u instanceof Employee).map(u->(Employee)u).collect(Collectors.toList());
	}
	private List<Teacher>getTeacher(){
		return this.getEmployee().stream().filter(u->u instanceof Teacher).map(u->(Teacher)u).collect(Collectors.toList());
	}
	
	
	
	
	
	

	
	
	

}
