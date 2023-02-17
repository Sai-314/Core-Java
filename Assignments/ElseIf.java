package Assignments;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		// Assignment for finding the biggest of 3 numbers using two if block conditions

		System.out.println("Assignment 1 :-");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st number: ");
		int n1 = sc.nextInt();

		System.out.println("Enter the 2nd number: ");
		int n2 = sc.nextInt();

		System.out.println("Enter the 3rd number: ");
		int n3 = sc.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is the biggest number");
		} else if (n2 > n3) {
			System.out.println("n2 is the biggest number");
		} else {
			System.out.println("n3 is the biggest number");

		}

		// Another approach
		System.out.println("Enter the 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the 3rd number: ");
		int num3 = sc.nextInt();

		int big = num1;
		if (num2 > big) {
			big = num2;
		}
		if (num3 > big) {
			big = num3;
		}
		System.out.println("biggest number is : " + big);

		// Another approach

		System.out.println("Assignment 2 :-");

		System.out.println("Enter the number: ");

		int number = sc.nextInt();

		System.out.println("Enter the age: ");
		int age = sc.nextInt();

		System.out.println("Enter the name: ");
		String name = sc.next();

		if (number < 0) {
			System.out.println("not a valid number");
		} else if (age < 18) {
			System.out.println("valid number");
			System.out.println("not a valid age");
		} else if (!name.equals("Sai")) {
			System.out.println("valid number");
			System.out.println("valid age");
			System.out.println("not a valid name");
		} else {
			System.out.println("valid number");
			System.out.println("valid age");
			System.out.println("valid name");
		}
	}
}
