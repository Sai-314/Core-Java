package Loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number : " + i);
			}
		}
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd number : " + i);
			}
		}

		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println("Even number : " + i);
		}

		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println("Odd number : " + i);
		}

		
		
		
		//Assignment to find big and small numbers using number of inputs
		System.out.println("Enter the number of inputs: ");
		int inputNo = sc.nextInt();

		int sum = 0;
		int big = 0;
		int small = 0;

		for (int i = 0; i <= inputNo; i++) {

			int n1 = sc.nextInt();

			sum = sum + n1;

			if (i == 1) {
				big = n1;
				small = n1;
			}
			if (n1 > big) {
				big = n1;
			}
			if(n1 < small) {
				small = n1;
			}
		}
		System.out.println("sum: "+ sum);
		System.out.println("big: "+ big);
		System.out.println("small "+ small);

	}
}
