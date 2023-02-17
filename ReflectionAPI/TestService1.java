package ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestService1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class c = Class.forName("ReflectionAPI.Service");
		Service service = (Service) c.newInstance();

		Method m = c.getDeclaredMethod("display", new Class[] { int.class, int.class });

		m.invoke(service, 500, 600);

	}

}
