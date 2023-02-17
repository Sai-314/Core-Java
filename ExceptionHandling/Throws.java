package ExceptionHandling;

import java.sql.SQLException;
import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();
		int output = 0;
		try {
			//Here we are calling 2nd method m2
			output = m2(num1, num2);
		} catch (SQLException e) {
			System.out.println("Number can't be zero: ");
		}
		System.out.println(output);
		System.out.println("main method ended");
	}

	public static int m2(int num1, int num2) throws SQLException {
		System.out.println("m2 started");
		//Here we are calling 3rd method m3
		int v2 = m3(num1, num2);
		System.out.println("m2 ended");
		return v2;
	}

	public static int m3(int num1, int num2) throws SQLException {
		System.out.println("m3 started");
		//Here we are calling 4th method m4
		int v3 = m4(num1, num2);
		System.out.println("m3 ended");
		return v3;
	}

	public static int m4(int num1, int num2) throws SQLException {
		System.out.println("m4 started");
		if (num2 == 0) {
			SQLException ex = new SQLException();

			throw ex;
		}
		System.out.println("m4 ended");
		return num1 / num2;
	}

}
