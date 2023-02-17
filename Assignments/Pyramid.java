package Assignments;

import java.util.Scanner;

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
				System.out.print("*");               // we use less than from 1 to until it
			}                                        // reaches its condition value
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
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size");
//		int n = sc.nextInt();
//		
//		for(int i=0 ; i<=n; i++) {
//			for(int j=0; j<=n; j++) {
//				
//				if(j==0 || j ==n/2 || (i==0 && j<n/2) || (i==n/2 && j<n/2)) {
//				System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		//Alignment
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		
		for(int i=0 ; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				
				if(i==0 || i==n/2 || j==0 || j==n) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
