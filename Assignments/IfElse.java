package Assignments;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {

		// Assignment
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		System.out.println("Enter the age: ");
		int agee = sc.nextInt();
		System.out.println("Enter the user: ");
		String user = sc.next();

		if (id > 0 && agee > 18 && user.equals("admin")) {
			System.out.println("Data valid");
		} else {
			System.out.println("Data Invalid");
		}
	}

}
