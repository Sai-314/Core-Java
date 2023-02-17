package Collections;

public class TestPerson {
	
	public static void main(String[] args) {
		
		
		Person[] persons = new Person[4];
		
		persons[0] = new Person(22, "Satya");
		persons[1] = new Person(33, "Gariii");
		persons[2] = new Person(44, "Swathi");
		persons[3] = new Person(55, "Arya");
		//persons[4] = new Person(66, "Sidd");
		
		
		for(Person p : persons) {
			System.out.println(p.getId() +" - "+ p.getName());
			//System.out.println(p);
		}
		
	}
}
