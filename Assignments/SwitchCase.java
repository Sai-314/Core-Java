package Assignments;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		// Assignment
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		String str = sc.next();
		String cm = "cm";
		switch (str) {
		case "S":
			System.out.println("Small size : 36 " + cm);
			break;
		case "M":
			System.out.println("Medium size : 38 " + cm);
			break;
		case "L":
			System.out.println("Large size :  40 " + cm);
			break;
		case "XL":
			System.out.println("Extra Large : 42 " + cm);
			break;
		case "XXL":
			System.out.println("Double Extra Large : 44 " + cm);
			break;
		default:
			System.out.println("Size not exist");
			break;
		}
	}
}
