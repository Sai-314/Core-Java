package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Arrays1 {
	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<>();

		arrList.add("Names");
		arrList.add("Fruits");
		arrList.add("Animals");
		arrList.add("Vegetables");
		arrList.add(0, "Relations");
		arrList.remove(2);
		arrList.remove("Vegetables");
		arrList.set(1, "Fruits");
		arrList.contains("Fruits");
		arrList.add("Names");
		// arrList.clear();
		// System.out.println(arrList);
		Collections.sort(arrList);
		for (String str : arrList) {
			System.out.println(str);
		}
		System.out.println(arrList.size());
		System.out.println(arrList.indexOf("Fruits"));
		System.out.println(arrList.get(2));
		System.out.println(arrList);
		// int pos = arrList.indexOf("Fruits");
		// System.out.println(pos);
		// String str = arrList.get(2);F
		// System.out.println(str);
		
		
		HashSet<String> hSet = new HashSet(arrList);
		
		hSet.add("Items");
		System.out.println("HashSet Elements");
		Iterator<String> it = hSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
}
}
