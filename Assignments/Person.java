package Assignments;

public class Person {

	
	int id;
	String name;
	int age;
	
	
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public void display() {
		System.out.println("This is Parent Display Method");
	}
}
