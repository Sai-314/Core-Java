package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] size = new int[s];

		for (int i = 0; i < size.length; i++) {
			System.out.println("Enter the name: ");
			String name = sc.next();

			if ("END".equals(name)) {
				break;
			}
			if (!a.contains(name)) {
				a.add(name);
			}

		}
		for (String names : a) {
			System.out.println(names);
		}
	}

}
