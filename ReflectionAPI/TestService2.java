package ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestService2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class c = Class.forName("ReflectionAPI.Service");
		Service service = (Service) c.newInstance();

		Method m = c.getDeclaredMethod("show", new Class[] { String.class });

		//If we want to access private method we need to use the setAccessible method
		m.setAccessible(true);
		m.invoke(service, "Sai");

	}

}
