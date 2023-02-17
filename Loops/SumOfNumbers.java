package Loops;

import java.util.Scanner;

public class SumOfNumbers {
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Approach 1 to sum
		 System.out.print("Enter the number to sum: ");
		    int sum =0;
			int num = sc.nextInt();
		
		for(int i =1; i<=num;i++) {
			sum = sum+i;
			//0+1
			//1+2
			//3+3
			//6+4
			//10+5
			//System.out.println(sum);
		}
		System.out.println(sum);
		
		//Approach 2 to sum
		System.out.print("Enter the number to sum: ");
		int size = sc.nextInt();	
		sum = size*(size+1)/2; // n(n+1)/2 -- formula to sum
		System.out.println(sum);
	}
	 
	 
}
