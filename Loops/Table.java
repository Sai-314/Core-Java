package Loops;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of tables: ");
		// int sum = sc.nextInt();
		// for(int num = 1; num<=sum; num++) {
		//
		// for(int i=1; i<=10; i++) {
		// //sum=1;
		// //sum=sum+1;
		//
		// int res = sum*i;
		// //System.out.println();
		// System.out.println(sum +" * "+i +" = "+res);
		// //System.out.println();
		// }
		//
		// }

		int tableNo = sc.nextInt();
		for (int table = 1; table <= tableNo; table++) {
			for (int i = 1; i <= 10; i++) {
				int res = table * i;
				System.out.println(table + " * " + i + " = " + res);
				// Incremented the table number in outer for loop and number multiples in inner
				// for loop
			}

		}
	}

}
