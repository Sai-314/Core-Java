package Assignments;

import java.util.Scanner;

public class Calculator {
		
	Scanner sc = new Scanner(System.in);

	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	//Methods by entering inputs in console
	public void sum() {	
		int sum = num1+ num2;
		System.out.println("Sum of two numbers is: "+sum);
	}
	public void sub() {
		int sub = num1-num2;
		System.out.println("Subtraction of two numbers is: "+sub);
	}
	public void mul() {
		int mul = num1*num2;
		System.out.println("Multiplication of two numbers is: "+mul);
	}
	public void div() {
		int div = num1/num2;
		System.out.println("Division of two numbers is: "+div);
	}
	
	
	//Methods by passing parameters
	
//	public void sum(int num1, int num2) {	
//		int sum = num1+ num2;
//		System.out.println("Sum of two numbers is: "+sum);
//	}
//	public void sub(int num1, int num2) {
//		int sub = num1-num2;
//		System.out.println("Subtraction of two numbers is: "+sub);
//	}
//	public void mul(int num1, int num2) {
//		int mul = num1*num2;
//		System.out.println("Multiplication of two numbers is: "+mul);
//	}
//	public void div(int num1, int num2) {
//		int div = num1/num2;
//		System.out.println("Division of two numbers is: "+div);
//	}
	
	
}
