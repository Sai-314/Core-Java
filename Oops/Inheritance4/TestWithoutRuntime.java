package Oops.Inheritance4;

import java.util.Scanner;

public class TestWithoutRuntime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bank name: ");
		String name = sc.next();

		if (name.contentEquals("HDFC")) {

			HDFC h = new HDFC();
			h.createAccount();		
			h.processLoan();
			h.demat();
		}
		else if(name.equals("ICICI")) {
			ICICI i = new ICICI();
			i.createAccount();
			i.processLoan();
		}

	}

}
