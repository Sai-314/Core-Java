package Oops.Inheritance5;

import java.util.Scanner;

//It is run time polymorphism of 2nd approach
//It is done by passing parameter reference
//If the method is expecting parent object then the method can be called by passing parent object or child object.
//Up casting

public class TestWithRuntime2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bank name: ");
		String name = sc.next();
		//RBI r = null;
		
		//For run time polymorphism we need to use parent as a reference
		if (name.contentEquals("HDFC")) {
			//converting child reference to parent reference
			HDFC h = new HDFC();
			execute(h);

		} else if (name.equals("ICICI")) {
			ICICI i = new ICICI();
			execute(i);
		}
	}

	//Here we are passing parent object
	private static void execute(RBI r) {
		r.createAccount();
		r.processLoan();
	}

}
