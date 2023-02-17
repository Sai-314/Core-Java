package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class TestPerson {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create hashset for persons
		Set<Person> persons = new HashSet<Person>();

		//create person objs
		Person p1 = new Person("user1",1000, 27);
		Person p2 = new Person("user2", 1001,  28);
		Person p3 = new Person("user3", 1002,  29);
		Person p4 = new Person("user3", 1002,  29); 
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		
		for(Person p : persons) {
			System.out.println(p);
		}

	}


}
