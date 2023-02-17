package Collections;

import java.util.Scanner;

public class StringArraySearch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] names = { "Sai", "Bhuvan", "Raja", "Gagan", "Sid" };

		System.out.print("Enter the name you need to check: ");
		String input = scanner.next();
		boolean found = false;
		for (String n : names) {
			if (input.equals(n)) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(input + " is available");
		} else {
			System.out.println(input + " is not available");
		}
	}
}
