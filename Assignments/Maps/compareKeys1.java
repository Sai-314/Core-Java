package Assignments.Maps;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Map.Entry;

public class compareKeys1 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2020202120);
		arr.add(2020202121);
		arr.add(2020202122);

		
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		hash.put(1, 2020202120);
		hash.put(2, 2020202121);
		hash.put(3, 2020202122);
		hash.put(3, 2020202120);
		hash.put(3, 2020202121);
		hash.put(3, 2020202122);
		hash.put(3, 2020202121);

		boolean check = arr.containsAll(hash.values()) ? true : false;
		System.out.println(check);

	}
}