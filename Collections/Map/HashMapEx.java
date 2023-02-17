package Collections.Map;

import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map.Entry;
//import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		// TreeMap<String, String> map = new TreeMap<String, String>();
		// HashMap<String, String> map = new LinkedHashMap<String, String>();

		map.put("12", "Me");
		System.out.println(map.get("12"));
		map.put("33", "Meaw");
		map.put("22", "Reaw");
		map.put("44", "Ceaw");
		map.remove("44");
		map.put("55", "Feaw");
		map.put("55", "Feaw");
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.entrySet()); // It will return entry objects
//		map.clear();
//		System.out.println(map.entrySet());
		System.out.println(map.values()); // It will return entry values
		System.out.println(map.keySet()); // It will return entry keys
		

		for (Entry<String, String> entry : map.entrySet()) { //to fetch all keys and values
			String key = entry.getKey(); //to fetch all keys
			String value = entry.getValue(); //to fetch all values
			System.out.println("key--- " + key + " --- value--- " + value);
		}

//		for(Entry<String, String> str : map.entrySet()) {
//			System.out.println(str);
//		}

	}

}
