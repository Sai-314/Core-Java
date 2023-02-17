package Oops.Constructor;

public class TestPerson {
	
	public static void main(String[] args) {
		//For this functions
		Person p = new Person(1,"jeevan",22);	
		p.view();
		
		Person p1 = new Person(2,"praveen");	
		p1.view();
		
		Person p3 = new Person(22);
		p3.view();
		
		Person p4 = new Person();
		System.out.println();
		p4.view();
		
		//For super functions
		Student s = new Student("");
		System.out.println(s.manSpeed);
		Student s1 = new Student();
		
	}

}
