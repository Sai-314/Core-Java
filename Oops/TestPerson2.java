package Oops;

public class TestPerson2 {
	public static void main(String[] args) {
		
		//Passing object to the method
		Person p = new Person();
		p.id = 3;
		p.name = "Kiran";
		p.age = 21;
		p.show(p);
		
		Person p2 = new Person();
		p2.id = 4;
		p2.name = "Balu";
		p2.age = 23;
		p.show(p2);
		
	}
	public static void show(Person p) {
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
	}
}
