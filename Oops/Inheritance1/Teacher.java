package Oops.Inheritance1;

public class Teacher extends Student {

	int id;
	String subject;

	public Teacher(String name, String department, int id, String subject) {
		super(id, name, department, subject);
		this.id = id;
		this.subject = subject;
	}

	public Teacher(String street, String city, String state, String country, int pincode) {
		super(street, city, state, country, pincode);
	}

	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

}
