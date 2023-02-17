package Oops.Constructor;

public class Person {

	private int id = 12;
	private String name = "priya";
	private int weight = 77;

	int manSpeed = 4000;

	// 1st constructor
	public Person(int id, String name, int weight) {
		// Here we are initializing local variable values to instance variable values
		this.id = id;
		this.name = name;
		this.weight = weight;
		System.out.println();

		// Here we are initializing instance variable values to local variable values
		// id = this.id;
		// name = this.name;
		// weight= this.weight;
	}

	// 2nd constructor
	public Person(int weight) {
		// Here we are accessing 3rd constructor by using this method.
		this(55, "Sai");
		this.weight = weight;
	}

	// 3rd constructor
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println();
	}

	public Person() {
		// Here we are accessing 1st constructor by using this method.
		this(99, "lava", 45);

		// This will be accessed automatically in child class constructor without using
		// super() method.
		System.out.println("Person class costructor");
	}

	// Here we are accessing instance variable values because we are able to access
	// those inside the class
	public void view() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(weight);
	}

}

class Student extends Person {

	public Student(String vehicleSpeed) {
		// Used super keyword
		System.out.println("Speed of student is " + super.manSpeed);
		vehicleSpeed = "5600";
	}

	public Student() {
		super();
		// Used super method
		// super();
		// super.view();
		System.out.println("Student class costructor");
	}

}
