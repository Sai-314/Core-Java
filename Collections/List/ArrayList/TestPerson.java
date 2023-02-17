package Collections.List.ArrayList;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {

		// ArrayList will print duplicates
		ArrayList<Person> persons = new ArrayList<Person>();

		Person p1 = new Person(1, "Sai", 22);
		Person p2 = new Person(2, "Baalu", 23);
		Person p3 = new Person(3, "Satya", 24);
		Person p4 = new Person(3, "Satya", 24);

		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);

		System.out.println(persons.get(1).toString());

		for (Person p : persons) {
			// System.out.println(p);
			System.out.println(p.getId() + "---" + p.getName() + "---" + p.getAge());
		}
	}

}
