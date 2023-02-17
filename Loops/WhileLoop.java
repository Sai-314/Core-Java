package Loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
        int sum = 0;
//		while(sum<100) {
//			int n1 = 13;
//			sum =sum+n1;
//		}
//		System.out.println(sum);
//		
//		
//		
//		int i =1;
//		while(i<=100) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println(sum);
		
        //Continue
		Scanner sc = new Scanner(System.in);
//		while(sum<100) {	
//			int n1 =sc.nextInt();
//			if(n1<0) {
//				continue;
//			}
//			sum = sum+n1;
//		}
//		System.out.println(sum);
	
		
		//Break		
//		while(sum<100) {	
//			int n1 =sc.nextInt();
//			if(n1<0) {
//				break;
//			}
//			sum = sum+n1;
//		}
//		System.out.println(sum);
		
		
//		Req:-
//		1)Take input the input from console
//	    2) perform sum of numbers
//	    3) if sum reaches 100 then stop the loop and print final sum
//	    4) if the input contains negative don't perform operation
//	    5) if the input is 999 the stop the the loop
		
		
		//Assignment
		
		while(sum<100) {
			System.out.println("Enter the inputs to sum: ");
			int inputs = sc.nextInt();
//			if(sum>=100) {
//				break;
//			}	
			if(inputs<0) {
				continue;
			}
			if(inputs>=999) {
				break;
			}
//			if(inputs<0 || inputs>=999) {
//				break;
//			}
			sum = sum+inputs;
		}
		System.out.println(sum);
	}
}
