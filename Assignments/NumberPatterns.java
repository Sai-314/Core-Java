package Assignments;

import java.util.Scanner;

public class NumberPatterns {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		//Assignment
		for(int i=1; i<=size; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j);
			}
			for(int j = i; j< size; j++) {
				System.out.print("-");
			}
			for(int j = 1; j<= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		//Assignment
		for(int i= size; i>=1; i-- ) {
			for(int j=i; j>=1; j-- ) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=2; i<=size; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//practiced one
		for(int i=1; i<=size; i++) {
			for(int j=i; j<=size; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
