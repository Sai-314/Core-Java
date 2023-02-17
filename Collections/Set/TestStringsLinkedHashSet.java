package Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestStringsLinkedHashSet {
	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();

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
