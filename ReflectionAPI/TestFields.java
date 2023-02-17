package ReflectionAPI;

import java.lang.reflect.Field;

public class TestFields {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class c = Class.forName("ReflectionAPI.Employee");

		Field[] fields = c.getDeclaredFields();

		Employee e = (Employee) c.newInstance();

		for (Field field : fields) {
			System.out.println("Variable is " + field.getName());
			System.out.println("Data type is " + field.getType());
			System.out.println("Value of variable is " + field.get(e));
			System.out.println();
		}
	}

}
