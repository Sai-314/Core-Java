package Oops;

public class TestPerson5 {
	
	public static void main(String[] args) {
		
		
		Person p =new Person();
		
		p.id =6;
		p.name = "Bhuvan";
		p.age = 45;
		
		Person p1 = new Person();
		p1.id =6;
		p1.name = "Bhuvan";
		p1.age = 45;
		
		equal(p,p1);
	}
	
	//We have used hashCode method in the person class to compare the objects
	public static void equal(Person p, Person p1) {
		if(p.equals(p1)) {
			System.out.println("objects are equal");
		}
		else {
			System.out.println("objects are not equal");
		}
	}

}
