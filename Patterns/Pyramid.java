package Patterns;


public class Pyramid {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i + 1); j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// Assignment of Reverse pyramid

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) { // 1<=1 prints 1 space in first row
				System.out.print("-");
			}
			for (int j = (2 * i) - 1; j <= 9; j++) { // 1<=9 prints 9 stars in first row
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		

		// Assignment of Diamond
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i + 1); j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i = 2; i <= 5; i++) {

			for (int j = 1; j <= i; j++) { // 1<=1 prints 1 space in first row
				System.out.print("-");
			}
			for (int j = (2 * i) - 1; j <= 9; j++) { // 1<=9 prints 9 stars in first row
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		

	}
}
