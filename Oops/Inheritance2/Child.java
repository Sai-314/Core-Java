package Oops.Inheritance2;

public class Child extends Parent {
	
	// Overriding and accessing the parent class method using super();
	public void show() {
		super.show();
		System.out.println("This is a child class method");
	}
}
