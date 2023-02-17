package Assignments;

import java.util.Scanner;

public class RightTriangleBase {
	public static void main(String[] args) {

		
		//Assignment
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
        //(i == 1 &&  j <= 1) 
		//||(i == 2 &&  j <= 2)
		//|| (i>=5 && j>=1)
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i >=1 && j<=i) ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i =1; i<=n/2; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
