package SortingObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee1 {

	public static void main(String[] args) {
		ArrayList<Employee1> emp1 = new ArrayList<Employee1>();
		Employee1 e = new Employee1("Sai", 3, 24);
		Employee1 e1 = new Employee1("Bhavya", 2, 23);
		Employee1 e2 = new Employee1("Arya", 1, 25);
		Employee1 e3 = new Employee1("Dharma", 4, 28);

		emp1.add(e);
		emp1.add(e1);
		emp1.add(e2);
		emp1.add(e3);
		
		
		Collections.sort(emp1, e1);
		System.out.println(emp1);

	}

}
