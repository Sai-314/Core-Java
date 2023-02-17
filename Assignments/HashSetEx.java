package Assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		//In LinkedHashSet, it will not allow duplicates
		Set<String> names = new HashSet<String>();
		
		//Source array
		//String [] nameStrings = {"Sai","Bhuvan","Barath","Shyam","Gagan"};

		//Input through console
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int s = sc.nextInt();
		int[] size = new int[s];

		for (int i = 0; i < size.length; i++) {
			System.out.print("Enter the name: ");
			String name = sc.next();
			if ("END".equals(name)) {
				break;
			}
			names.add(name);
		}
		for (String name : names) {
			System.out.println(name);
		}
	}

}
