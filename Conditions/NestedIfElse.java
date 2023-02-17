package Conditions;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		// If number is positive then only enter into the second condition
		// If age is greater than 18 print valid then only enter into second condition
		// If string name = admin print valid name if not print not valid
		Scanner sc = new Scanner(System.in);
		System.out.println("Assignment 2 :-");

		System.out.println("Enter the number: ");

		int number = sc.nextInt();

		System.out.println("Enter the age: ");
		int age = sc.nextInt();

		System.out.println("Enter the name: ");
		String name = sc.next();

		// 1st trail
		/*
		 * if (number > 0) { System.out.println("valid number"); if (age > 18) {
		 * System.out.println("valid number and valid age"); if
		 * (name.equalsIgnoreCase("Sai")) {
		 * System.out.println("valid number, valid age and valid name"); } else if
		 * (!(name.equalsIgnoreCase("Sai"))) {
		 * System.out.println("valid number, valid age and not valid name"); } } else {
		 * System.out.println("valid number and not valid age"); } } else if (number <
		 * 0) { System.out.println("not valid number"); }
		 */
		// 2nd trail

		if (number > 0) {
			System.out.println("valid number");
			if (age > 18) {
				System.out.println("valid number and valid age");
				if (name.equalsIgnoreCase("admin")) {
					System.out.println("valid number, valid age and valid name");
				} else {
					System.out.println("valid number, valid age and not valid name");
				}
			} else {
				System.out.println("valid number and not valid age");
			}
		} else {
			System.out.println("not valid number");
		}
	}
}
