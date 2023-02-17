package Patterns;

import java.util.Scanner;

public class PatternM {
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the size :");
		
		int size = sc.nextInt();
		//|| (i==2 && j==9) ||(i==3 && j==8) 
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=size; j++) {
				if(j==1 || j==size || (i>1 && i<=size/2 && j==i)
						//|| (i==2 && j==size-i+1) ||(i==3 && j==size-i+1) 
						//|| (i==4 && j==size-i+1)
						|| (i<=size/2 && j==size-i+1)) { //i<=5 && j==10-5+1
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		//Sir Approach
		System.out.println();
		
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();

		for(int i=0 ; i<=n; i++) {
			for(int j=0; j<=n; j++) {

				if(j==0 || 
						j==n-1 ||
						(i==j && j<=n/2) ||
						(i+j==n-1 && j>=n/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	
		
	}

}
