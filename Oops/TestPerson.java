package Oops;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.id = 23;
		p.name ="Udhay";
		p.age = 34;
		
		
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println();
		
		Person p2 = p;		//Here we are assigning p value to p2
		System.out.println(p2.id); //p2 is not creating an extra memory.it is just pointing to p object
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println();
		p2.id = 45;
		p2.name ="Bhanu";
		p2.age = 56;
		
		//If we assign values to any one of the object.then values will be changed in both the objects
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println();
		
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
	}

}
