package Assignments.Maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DataCopyArrayListToSets {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Custard");
		arr.add("Orange");
		arr.add("Grape");
		arr.add("Kiwi");
		arr.add("Apple");
		arr.add("Banana");
		arr.add("Banana");
		HashSet<String> h = new HashSet<String>();

//		TreeSet<String> h1 = new TreeSet<String>();
//		LinkedHashSet<String> h3 = new LinkedHashSet<String>();

		h.addAll(arr);
		for (String val : h) {
			System.out.println(val);
		}
	}
}
