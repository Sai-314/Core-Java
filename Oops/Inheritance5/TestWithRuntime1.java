package Oops.Inheritance5;

import java.util.Scanner;

import Oops.Inheritance4.HDFC;
import Oops.Inheritance4.ICICI;
import Oops.Inheritance4.RBI;

//It is run time polymorphism of 1st approach
//Up casting
public class TestWithRuntime1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bank name: ");
		String name = sc.next();
		RBI r = null;
		if (name.contentEquals("HDFC")) {
			r = new HDFC();
			r.createAccount();
			r.processLoan();

		} else if (name.equals("ICICI")) {
			r = new ICICI();
			r.createAccount();
			r.processLoan();

		}

	}

}
