package Oops.Inheritance1;

public class Student extends Address {

	int pinNo;
	String name;
	String department;
	String course;

	public Student(int pinNo, String name, String department, String course) {
		super("", "", "", "", 0);
		this.pinNo = pinNo;
		this.name = name;
		this.department = department;
		this.course = course;
	}

	public Student(String street, String city, String state, String country, int pincode) {
		super(street, city, state, country, pincode);
	}

	public int getPinNo() {
		return pinNo;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getCourse() {
		return course;
	}

}
