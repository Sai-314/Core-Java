package ExceptionHandling;

import java.util.Scanner;


public class Arithmetic1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();

		int num3 = 0;
		try {
			num3 = num1 / num2;

		} catch (ArithmeticException e) {
			System.out.println("Bad input "+ e);
		}
		System.out.println(num3);
	}

}
