package Assignments.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapOO {

	public static void main(String[] args) {

		Map<Employee, Student> os = new HashMap<>();
		Employee e = new Employee(2321, 567897);
		Employee e1 = new Employee(2322, 567897);
		Employee e2 = new Employee(2323, 567897);
		Employee e3 = new Employee(2324, 567897);
		Employee e4 = new Employee(2321, 567897);

		Student s1 = new Student(133456, "Babu", "AirForce :))", "B.tech");
		Student s2 = new Student(133456, "Teja", "AirForce :))", "B.tech");
		Student s3 = new Student(133456, "Dheeraj", "AirForce :))", "B.tech");
		Student s4 = new Student(133456, "Sai", "IT", "B.tech");
		Student s = new Student(133456, "Sai", "IT", "B.tech");

		os.put(e, s);
		os.put(e1, s1);
		os.put(e2, s2);
		os.put(e3, s3);
		os.put(e4, s4);

		for (Entry<Employee, Student> entry : os.entrySet()) {
			Employee key = entry.getKey();
			Student value = entry.getValue();
			System.out.println("Key--- " + key + "     Value--- " + value);
		}
		
		System.out.println(e4.hashCode());
		System.out.println(s.hashCode());
		

//		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//		
//		hm.put(1, 1);
//		hm.put(2, 1);
//		hm.put(3, 1);
//		hm.put(4, 1);
//		hm.put(5, 1);
//		hm.put(6, 1);
//		hm.put(7, 1);
//		hm.put(8, 1);
//		hm.put(9, 1);
//		hm.put(10, 1);
//		hm.put(12, 1);
//		hm.put(13, 1);
//		hm.put(14, 1);
//		hm.put(15, 1);
//		System.out.println(hm.entrySet());
	}

}
