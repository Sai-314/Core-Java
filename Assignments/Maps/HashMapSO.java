package Assignments.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSO {
	public static void main(String[] args) {
		Map<String, Employee> os = new HashMap<>();
		Employee e = new Employee(2323, 567897);
		Employee e1 = new Employee(2323, 567897);
		Employee e2 = new Employee(2323, 567897);
		Employee e3 = new Employee(2323, 567897);
		Employee e4 = new Employee(4444, 567897);
		
		System.out.println(e4.hashCode());

		os.put("Sai", e);
		os.put("Babu", e1);
		os.put("Teja", e2);
		os.put("Dheeraj", e3);
		os.put("Sai", e4);

		for (Entry<String, Employee> entry : os.entrySet()) {
			String key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println("Key--- " + key + "     Value--- " + value);
		}
		

	}

}
