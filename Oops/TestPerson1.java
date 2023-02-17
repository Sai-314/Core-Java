package Oops;

public class TestPerson1 {

	public static void main(String[] args) {
		Person p = new Person();

		p.id = 5;
		p.name = "Kiran";
		p.age = 21;
		
		Person p2 = new Person();
		p2.id = 6;
		p2.name = "Balu";
		p2.age = 23;
		
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}

}
