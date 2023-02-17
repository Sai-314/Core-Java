package Oops.Inheritance;

public class TestMain {
	
	public static void main(String[] args) {
		
		
		//1st Approach
		Person p = new Person();
		//Without using constructors in their classes here we are assigning their values through objects.
		p.id = 10;
		p.name = "Bharat";
		p.age = 33;
		p.disPerson();
		System.out.println();
		Employee e = new Employee();
		e.id = 20;
		e.name = "Ratan";
		e.age =55;
		e.panNo = 45456;
		e.ppfNo = 984803303;
		e.disPerson();
		System.out.println();
		e.disEmployee();
		System.out.println();
		
		
		//2nd Approach
		
		//Reference object created for relating to two classes
		//By this we call the overridden methods which are in child class
		//but we cannot initialize their values in main class through this object...have to initialize in their own class
		//Also we cannot call the newly created methods in child class
		//It is called Up Casting
		Person p1 = new Employee();		
		p1.id = 55;
		p1.name = "Kiran";
		p1.age = 70;
		p1.disPerson();
		System.out.println(); 
		
		//It is called Down Casting
		//By this we can call newly created methods in child class
		Employee e1 = (Employee)p1;
		e1.disPerson();
		e1.disEmployee();
		e1.disManager();
		System.out.println();
		
				
		
	}
}
