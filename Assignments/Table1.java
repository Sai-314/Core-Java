package Assignments;

import java.util.Scanner;

public class Table1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of tables: ");

		int tNo = sc.nextInt();

		for (int i = 1; i <= tNo; i++) {
			if (i == 7) {
				for (int j = 1; j <= 10; j++) {

					System.out.println(i + "*" + j + "=" + i * j);

				}
			}

		}

	}

}
