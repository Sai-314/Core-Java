package Assignments;

import java.util.Scanner;

public class FindBigUsingTernary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int big = a > b && b > c ? a : b > c && c > a ? b : c;
		System.out.println(big);

	}
}
