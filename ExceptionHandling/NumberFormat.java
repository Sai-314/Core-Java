package ExceptionHandling;

import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age :");
		String age = sc.next();
		int ageInt = 0;

		try {
			ageInt = Integer.parseInt(age);
		} catch (NumberFormatException e) {
			System.out.println("Enter the valid number");
		}
		System.out.println("After conversion age int :: " + ageInt);
	}
}
