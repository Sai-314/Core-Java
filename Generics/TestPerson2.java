package Generics;

public class TestPerson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person2<String> p1 = new Person2<String>("Person Id :");

		System.out.println(p1.getId());

		Person2<Integer> p2 = new Person2<Integer>(1310112534);

		System.out.println(p2.getId());

	}

}
