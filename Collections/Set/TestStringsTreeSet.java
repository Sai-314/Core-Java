package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class TestStringsTreeSet {
	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();

		// add text in hashset
		names.add("java");
		names.add("sap");
		names.add("hana");
		names.add("apple");
		names.add("zebra");
		names.add("sap");
		names.add("veeru");
		names.add("dotnet");
		names.add("hana");
		names.add("java");
		names.add("sap");

		// print all
		System.out.println("Entered NAMES ARE :");
		for (String s : names) {
			System.out.println(s);
		}

	}

}
