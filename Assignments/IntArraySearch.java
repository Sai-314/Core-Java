package Assignments;

import java.util.Scanner;

public class IntArraySearch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int s = scanner.nextInt();
		int[] size = new int[s];
		int num = 0;
		int i = 0;
		for (i = 0; i <= size.length - 1; i++) {
			System.out.print("Enter the number " + (i + 1) + " :");
			num = scanner.nextInt();
			size[i] = num;
		}

		System.out.print("Enter the number you need to check: ");
		int input = scanner.nextInt();
		//compare input with every element inside the array
		boolean found = false;
		for (int n : size) {
			if (input == n) {
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
