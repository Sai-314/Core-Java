package ReflectionAPI;

public class Ex1 {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("ReflectionAPI.Person");
		Class c1 = Class.forName("ReflectionAPI.Student");

		System.out.println(c.getName());
		System.out.println(c1.getName());
	}

}
