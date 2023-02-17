package Oops;

public class TestPerson3{
	
	public static void main(String[] args) {
		
		//Method returning object
		Person p1 = getData(12,"James",34);	
		p1.show(p1);
//		System.out.println(p1.id);
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		
		
		Person p2 = getData(44,"Bond",24);	
		p2.show(p2);
//		System.out.println(p2.id);
//		System.out.println(p2.name);
//		System.out.println(p2.age);
		
	}
	
	public void show(Person p3) { //p3 is a local variable
		System.out.println(p3.id);
		System.out.println(p3.name);
		System.out.println(p3.age);
	}
	
	//Method returning object
	public static Person getData(int id, String name, int age) {
		Person p =new Person();
		p.id = id;
		p.name = name;
		p.age = age;
		return p;
	}
	
	//Note:-
	//Variables are created inside the method -- local variables
	//Here int id, String name and int age are local variables. They created inside the method.
	
	
}