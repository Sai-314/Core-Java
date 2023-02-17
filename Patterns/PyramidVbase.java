package Patterns;

import java.util.Scanner;

public class PyramidVbase {
	public static void main(String[] args) {
		
		//Assignment
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int i =1; i<=n/2; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i >=1 && j<=i) || (i<=n/2 && j>n-i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	
	}

}
