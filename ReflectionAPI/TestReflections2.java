package ReflectionAPI;

public class TestReflections2 {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class c = Class.forName("ReflectionAPI.Employee");

		Employee emp = (Employee) c.newInstance();

		// Here we created class object and also employee class object. By creating
		// employee object only we are able to set the data and access them.
		emp.empAge = 45;
		emp.empQualification = "Degree";

		System.out.println(emp.empAge);
		System.out.println(emp.empQualification);
	}

}
