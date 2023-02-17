package Oops.Inheritance1;

public class TestMain2 {

	public static void main(String[] args) {

		Student student = new Student(133456, "Sai", "Mechanical", "B.tech");

		Student preAddress = new Student("Jeevan nagar", "Hyderabad", "AP", "India", 5467575);
		Student currAddress = new Student("Madura Ngar", "Kakinada", "AP", "India", 7656546);
		Student ofcAddress = new Student("Rama nagar", "Bangalore", "KA", "India", 4567757);

		System.out.println("Student details:- ");
		System.out.println(student.pinNo);
		System.out.println(student.name);
		System.out.println(student.department);
		System.out.println(student.course);
		System.out.println();

		System.out.println("Student Permanent Address:- ");
		System.out.println(preAddress.street);
		System.out.println(preAddress.city);
		System.out.println(preAddress.state);
		System.out.println(preAddress.country);
		System.out.println(preAddress.pincode);
		System.out.println();

		System.out.println("Student Current Address:- ");
		System.out.println(currAddress.street);
		System.out.println(currAddress.city);
		System.out.println(currAddress.state);
		System.out.println(currAddress.country);
		System.out.println(currAddress.pincode);
		System.out.println();

		System.out.println("Student Office Address:- ");
		System.out.println(ofcAddress.street);
		System.out.println(ofcAddress.city);
		System.out.println(ofcAddress.state);
		System.out.println(ofcAddress.country);
		System.out.println(ofcAddress.pincode);
		System.out.println();

		Teacher teacher = new Teacher("Mechanical", "Sita", 2022567, "Maths");
		Teacher perAddress = new Teacher("Bala Nagar", "Palakol", "AP", "India", 5467575);

		System.out.println("Teacher details:- ");
		System.out.println(teacher.id);
		System.out.println(teacher.name);
		System.out.println(teacher.subject);
		System.out.println(teacher.department);
		System.out.println();

		System.out.println("Teacher Permanent Address:- ");
		System.out.println(perAddress.street);
		System.out.println(perAddress.city);
		System.out.println(perAddress.state);
		System.out.println(perAddress.country);
		System.out.println(perAddress.pincode);

	}

}
