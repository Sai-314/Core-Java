package Basic;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
  
		// Diamond pattern
		for (int i = 1; i < 8; i++) {
			for (int k = 6; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// System.out.println();
		for (int i = 1; i < 9; i++) {
			for (int k = 2; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j < 9 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Square pattern
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// Increasing triangle pattern

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		// Decreasing triangle pattern
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		// Right sided triangle
		for (int i = 1; i <= n; i++) {
			for (int j = 2 * (n - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// Right sided triangle

		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print("");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Pattern practice

		int i, j;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for (i = 1; i <= 5; i++) {
			for (j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println();
		for (i = 1; i <= 6; i++) {
			for (j = 6 - i; j > 0; j--) {
				System.out.print("*");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		for (i = 1; i <= 6; i++) {
			for (j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (j = 6 - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
//
		System.out.print("Enter the number of rows you want to print: ");
		int row, space = 1;
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		space = row - 1;
		for (j = 1; j <= row; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;
			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		for (j = 1; j <= row - 1; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			//
			space++;
			for (i = 1; i <= 2 * (row - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
