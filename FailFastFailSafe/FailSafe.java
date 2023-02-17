package FailFastFailSafe;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<Integer> arr = new CopyOnWriteArrayList<Integer>();

		// For HashMaps --
		// ConcurrentHashMap<K, V>

		// For sets --
		// CopyOnWriteArraySet<E>

		// For Lists --
		// CopyOnWriteArrayList<E>

		arr.add(123);
		arr.add(345);
		arr.add(5678);
		arr.add(1234);
		arr.add(904);

		// This loop will perform only operation at a time and if we add data after
		// sys out it will not throw any exception because here we used
		// CopyOnWriteArrayList object.
		// and it will not print added data in the loop
		for (Integer i : arr) {
			System.out.println(i);
			arr.add(333);
		}
	}
}
