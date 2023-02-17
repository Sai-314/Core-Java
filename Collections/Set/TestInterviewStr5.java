package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class TestInterviewStr5 {
	public static void main(String[] args) {
		// create hashset for string
		Set<String> names = new HashSet<>();

		// add variable x to hashset
		String x = "user1";
		names.add(x);

		String y = "user1";
		if (names.contains(y)) { // y is a duplicate x
			System.out.println("y exists");
		} else {
			System.out.println("y doesnt exists");
		}
		// HashSet -> avoids duplicates ; But stores the elements in random order ;
		// Insertion order is not maintained.
		//
		//
		// Treeset -> avoids duplicates ; But stores the elements in sorting order ;
		// Insertion order is not maintained.
		//
		//
		// LinkedHashSet -> avoids duplicates ; Insertion order maintained.
	}
}
