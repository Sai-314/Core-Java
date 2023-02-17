package Patterns;

import java.util.Scanner;

public class NumberPatterns {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();
		// int size = sc.nextInt();

		for (int i = size; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();
		
		
        //Practiced one
		for (int i = 1; i <= size; i++) {
			for (int j = i; j <= size; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		
		
		// output:-
		// 1 1 1 1 1
		// 2 2 2 2 2
		// 3 3 3 3 3
		// 4 4 4 4 4
		// 5 5 5 5 5

		// output:-
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5

		// for(int i=1; i<=5; i++) {
		//
		// for(int j=1; j<=5; j++) {
		// System.out.print(i);
		// }
		// System.out.println();
		// }

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
