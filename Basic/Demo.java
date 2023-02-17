package Basic;

import java.util.*;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collector;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = new String[] { "ab", "a", "bc", "abc", "b", "c", "d", "dbc", "bac" };
		
		Arrays.sort(array);
		for(String arr : array) {
			System.out.println(arr);
		}

		
//		TreeSet<String> a = new TreeSet<String>();		
//
//		for (String aa : arr) {
//			a.add(aa);
//		}
//		System.out.println(a);
//
//		System.out.println("--------------");
	}

}
