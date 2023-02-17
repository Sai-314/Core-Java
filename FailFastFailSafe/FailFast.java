package FailFastFailSafe;

import java.util.ArrayList;

public class FailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(123);
		arr.add(345);
		arr.add(5678);
		arr.add(1234);
		arr.add(904);

		// This loop will perform only operation at a time and if we add data after
		// sysout it will throw ConcurrentModificationException
		for (Integer i : arr) {
			System.out.println(i);
			arr.add(333);
		}

	}

}
