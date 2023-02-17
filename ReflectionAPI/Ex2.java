package ReflectionAPI;

public class Ex2 {

	public static void main(String[] args) {

		Person p = new Person();

		Class c = p.getClass();
		System.out.println("-------Person class-----");
		System.out.println(c.getName());

		Class c1 = p.getClass();
		System.out.println("------Student class-----");
		System.out.println(c1.getName());
	}

}
