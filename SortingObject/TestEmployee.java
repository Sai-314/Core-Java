package SortingObject;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e = new Employee(3, "Sai", 24);
		Employee e1 = new Employee(2, "Bhavya", 23);
		Employee e2 = new Employee(1, "Sravya", 25);

		ArrayList<Employee> emp = new ArrayList<Employee>();

		emp.add(e);
		emp.add(e1);
		emp.add(e2);

		Collections.sort(emp);
		System.out.println(emp);

		
	}

}
