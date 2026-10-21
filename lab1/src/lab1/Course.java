package lab1;

public class Course {
	String name;
	String description;
	int creditNum;
	String prerequisite;
	public Course(String name,String description,int creditNum,String prerequisite) {
		this.name=name;
		this.description=description;
		this.creditNum=creditNum;
		this.prerequisite=prerequisite;
		
	}
	public Course(String prerequisite,String name) {
		this.prerequisite=prerequisite;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getCreditNum() {
		return creditNum;
	}
	public String prerequisite() {
		return prerequisite;
	}
	public String toString() {
		return prerequisite+" "+name;
	}
	

}
