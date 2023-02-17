package Collections.Map;

import java.util.HashMap;

public class HashMapEx1 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		// If one index contains multiple values it is formed like a linked list
		// It internally follows hashing algorithm.
		// null value always stores in a index 1...if it contains multiple nulls then it
		// overrides.
		hm.put(1, 1); 
		hm.put(2, 1);
		hm.put(3, 1);
		hm.put(4, 1);
		hm.put(5, 1);
		hm.put(6, 1);
		hm.put(7, 1);
		hm.put(8, 1);
		hm.put(9, 1);
		hm.put(10, 1);
		hm.put(11, 1);
		hm.put(12, 1);
		hm.put(1, 1);
	}
}
