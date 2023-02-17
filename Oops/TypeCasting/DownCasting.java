package Oops.TypeCasting;

public class DownCasting {

	public static void main(String[] args) {
		// By Up Casting we are able to access and initialize only parent class variables
		
		Parent1 p = new Child1();
		p.name = "Shubham";

		// Performing Down casting Implicitly
		 //Child c = new Parent(); // it gives compile-time error

		// Performing Down casting Explicitly
		// By Down Casting we are able to access and initialize both parent and child class objects
		
		Child1 c = (Child1) p;
		c.age = 18;
		System.out.println(c.name);
		System.out.println(c.age);
		c.showMessage();
	}
}
