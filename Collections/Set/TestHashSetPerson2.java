package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetPerson2 {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<Person>();

		Person p1 = new Person("user5", 123, 45);
		persons.add(p1);

		Person p2 = new Person("user5", 123, 45);

		System.out.println(persons.contains(p1));
		System.out.println(persons.contains(p2));

	}
}
