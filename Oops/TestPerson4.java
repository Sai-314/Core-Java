package Oops;

public class TestPerson4 {

	public static void main(String[] args) {
	
         Person p = new Person();
         
         p.id = 21;
         p.name = "Mourya";
         p.age = 44;
     	
         show(p);
		 modify(p);
		 show(p);
	}
	public static void show(Person p) {
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
	}
	
	
	//Method 1 calls Method 2 by passing object, If Method 2 is modifying object....it will impact on Method 1
	
	public static void modify(Person p1) {
		p1.id = 31;
		p1.name = "Sourya";
		p1.age = 45;
	}

}
