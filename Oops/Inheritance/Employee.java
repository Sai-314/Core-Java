package Oops.Inheritance;


//By extending class we are getting that class variables and methods....nothing but instance.
public class Employee extends Person {
	
	int panNo =456;
	int ppfNo=85555;
	
	public void disEmployee() {
		System.out.println(panNo);
		System.out.println(ppfNo);
	}
	public void disPerson() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(panNo);
		System.out.println(ppfNo);
	}
	
	public void disManager() {
		System.out.println("Man-age-er");
	}

}
