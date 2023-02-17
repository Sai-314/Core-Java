package Assignments.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapOS {
	public static void main(String[] args) {

		Map<Employee, String> os = new HashMap<>();
		Employee e = new Employee(2321, 567897);
		Employee e1 = new Employee(2322, 567897);
		Employee e2 = new Employee(2323, 567897);
		Employee e3 = new Employee(2324, 567897);
		Employee e4 = new Employee(2325, 567897);
		os.put(e, "Sai");
		os.put(e1, "Babu");
		os.put(e2, "Teja");
		os.put(e3, "Dheeraj");
		os.put(e4, "SomeOne");

		for(Entry<Employee, String> entry : os.entrySet()) {
			Employee key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key--- " + key + "     Value--- " + value);
			
		}
		
	}
}
