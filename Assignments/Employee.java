package Assignments;

public class Employee extends Person {

	int pan;
	int ppfNo;

//	public Employee(int id, String name, int age) {
//		super(id, name, age);
//	}

	public Employee(int id, String name, int age, int pan, int ppfNo) {
		super(id, name, age);
		this.pan = pan;
		this.ppfNo = ppfNo;
	}

	public void display() {
		super.display();
		System.out.println("This is Child Display Method");
	}

}
