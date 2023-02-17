package ExceptionHandling;

import java.util.Scanner;

public class Throw {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second num: ");
		int num2 = sc.nextInt();
		try {
			System.out.println(getData(num1, num2));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Please provide proper input: ");
		}
	}

	public static int getData(int num1, int num2) {
		if (num2 == 0) {
			IndexOutOfBoundsException ex = new IndexOutOfBoundsException("Number can't be zero");
			throw ex;
		}
		return num1 / num2;
	}

}
