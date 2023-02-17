package Assignments.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class compareKeys {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2020202120);
		arr.add(2020202121);
		arr.add(2020202122);

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		hash.put(1, 2020202120);
		hash.put(2, 2020202121);
		hash.put(3, 2020202123);
		hash.put(4, 2020202122);
		hash.put(5, 2020202125);
		hash.put(6, 2020202120);
		hash.put(7, 302020212);
		hash.put(8, 402020212);
		hash.put(9, 502020212);
		hash.put(10, 602020212);
		hash.put(11, 2020202120);

		for (Entry<Integer, Integer> m : hash.entrySet()) {
//			if (arr.contains(m.getValue())) {
//				System.out.println(true);
//			}
//			else {
//				System.out.println(false);
//			}			
			//Using ternary operator
			boolean check = arr.contains(m.getValue()) ? true : false;
			System.out.println(check);

		}

	}
}
