package ReflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflections {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("ReflectionAPI.Employee");

		
		//Here without creating that class objects we are accessing that class feilds and methods
		//feilds are instance variables
		Field[] fields = c.getDeclaredFields();

		System.out.println("----Instance Variables Names----");
		for (Field field : fields) {
			System.out.println(field.getName());
		}

		Method[] methods = c.getMethods();
		System.out.println("----Method Names----");
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
