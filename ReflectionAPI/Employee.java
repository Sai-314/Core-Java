package ReflectionAPI;

public class Employee {

	int empId = 1256;
	String empName = "Sai";
	int empAge = 24;
	String empQualification = "Engineering";
	int empShift = 2;
	String empDepartment = "IT";

	public void empDetails() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empAge);
	}

	public void empAbout() {
		System.out.println(empQualification);
		System.out.println(empShift);
		System.out.println(empDepartment);
	}

	public static void empShow() {

	}
}
