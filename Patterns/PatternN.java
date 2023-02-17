package Patterns;

import java.util.Scanner;

public class PatternN {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size :");

		int size = sc.nextInt();
		// || (i==2 && j==9) ||(i==3 && j==8)
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j == 1 || j == size || (i > 1 && i <= size && j == i)) {
					// || (i==2 && j==size-i+1) ||(i==3 && j==size-i+1)
					// || (i==4 && j==size-i+1)
					// || (i<=size/2 && j==size-i+1)) { //i<=5 && j==10-5+1
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}
}
