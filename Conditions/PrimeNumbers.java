package Conditions;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		
		int m = 0;
		for (int i = 2; i <= size; i++) {
			m = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					m++;
					break;
				}
			}
			if (m == 0) {
				System.out.println(i);
			}
		}
	}
}
