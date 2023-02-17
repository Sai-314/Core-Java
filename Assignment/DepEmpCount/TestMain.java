package Assignment.DepEmpCount;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class TestMain {

	public static void main(String[] args) {

		Department d1 = new Department("d1");
		Department d2 = new Department("d2");
		Department d3 = new Department("d3");
		Department d4 = new Department("d4");
		Department d5 = new Department("d5");
		Department d6 = new Department("d6");
		Department d7 = new Department("d7");
		Department d8 = new Department("d8");
		Department d9 = new Department("d9");
		Department d10 = new Department("d10");

		Employee e1 = new Employee("e1");
		Employee e2 = new Employee("e2");
		Employee e3 = new Employee("e3");
		Employee e4 = new Employee("e4");
		Employee e5 = new Employee("e5");
		Employee e6 = new Employee("e6");
		Employee e7 = new Employee("e7");
		Employee e8 = new Employee("e8");
		Employee e9 = new Employee("e9");
		Employee e10 = new Employee("e10");

		LinkedHashMap<Department, ArrayList<Employee>> dp = new LinkedHashMap<Department, ArrayList<Employee>>();

		dp.put(d1, new ArrayList<Employee>());
		dp.get(d1).add(e1);
		dp.get(d1).add(e3);
		dp.get(d1).add(e9);
		dp.put(d2, new ArrayList<Employee>());
		dp.get(d2).add(e2);
		dp.get(d2).add(e10);
		dp.put(d3, new ArrayList<Employee>());
		dp.get(d3).add(e4);
		dp.put(d4, new ArrayList<Employee>());
		dp.get(d4).add(e6);
		dp.put(d5, new ArrayList<Employee>());
		dp.get(d5).add(e7);
		dp.put(d7, new ArrayList<Employee>());
		dp.get(d7).add(e5);
		dp.get(d7).add(e8);
		for (Entry<Department, ArrayList<Employee>> d : dp.entrySet()) {

//			if (dp.keySet().containsAll(dp.values())) {
//				
//				System.out.println(d.getKey() + "----" + dp.values());
//			}

			// System.out.println(dp.keySet() + "----" + dp.values());
			System.out.println(d.getKey() + "----" + d.getValue());
			// System.out.println(d.getKey() + "----" + dp.values());
			// System.out.println(dp.entrySet());
			// System.out.println(d.getKey() + "----" + d.getValue());
		}
		// System.out.println(dp.entrySet());
		// System.out.println(dp.keySet() + "---"+dp.values());

		// System.out.println(d1);

	}

}
