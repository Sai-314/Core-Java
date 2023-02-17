package Assignments.Maps;

public class Student {
	
	int pinNo;
	String name;
	String department;
	String course;
	public Student(int pinNo, String name, String department, String course) {
		super();
		this.pinNo = pinNo;
		this.name = name;
		this.department = department;
		this.course = course;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [pinNo=" + pinNo + ", name=" + name + ", department=" + department + ", course=" + course + "]";
	}
	

}
