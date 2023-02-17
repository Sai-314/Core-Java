package Annotations;

public class Employee {

	public static void main(String[] args) {

		@Config (min = 10)
		int id = 11;
		
		@Config (min = 1)
		String name = null;

		System.out.println(id);
		System.out.println(name);

	}

}
