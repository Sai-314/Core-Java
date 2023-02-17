package ExceptionHandling;

import java.util.Scanner;

class Demo1 {

	public void fun() {
		System.out.println("connection terminated");

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num1");
			int a = sc.nextInt();

			System.out.println("Enter the num2");
			int b = sc.nextInt();

			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Problem solved 1");
			throw e;
		} finally {
			System.out.println("Connection terminated 2");
		}
	}
}

public class TestException5 {

	public static void main(String[] args) {

		System.out.println("Connection established");

		try {
			Demo1 d1 = new Demo1();
			d1.fun();
		} catch (ArithmeticException e) {
			System.out.println("Problem solved 2");
		}

		System.out.println("Connection terminated 3");

	}

}
