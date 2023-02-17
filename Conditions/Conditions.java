package Conditions;

//import java.util.Scanner;

public class Conditions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// else if block uses when if block condition not becomes true
		if (10 < 8) {
			System.out.println("Inside if block");
		} else if (12 < 8) {
			System.out.println("Inside 1st else if block");
		} else if (5 == 5) {
			System.out.println("Inside 2nd else if block");
		} else {
			System.out.println("Inside else block");
		}

		/*
		 * String a ="name"; //id = 21 String b = "name"; // id = 23
		 * 
		 * int c =29; //id -45 int d =29; //id -56
		 * 
		 * 
		 * if(c == d) { System.out.println("valid name"); }else {
		 * System.out.println("not valid name"); }
		 */

	}
}
