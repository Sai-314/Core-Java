package Collections.Set;

public class TestHashSetPerson3 {
	public static void main(String[] args) {
		Person p1 = new Person("user5", 123, 45);

		Person p2 = new Person("user5", 123, 45);

		Person p3 = new Person("user5", 123, 45);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}
}
