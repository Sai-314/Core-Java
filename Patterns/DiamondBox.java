package Patterns;

import java.util.Scanner;

public class DiamondBox {

	public static void main(String[] args) {
		
		//not completed
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n =sc.nextInt();
		//|| (i>=5 && j>=n-1)
		//||(i<=n && j<=(n/2)+i)
		//(i<=n/2 && j<=(n/2)-i)
		//(i<=n && j<=(n-i)) || (i>n && j<i-n) || 
		for(int i=1; i<=n/2; i++) {
			for(int j=1; j<=n; j++) {
				if(((i >=1 && j<=n/2-i) || (i<=n/2 && j>n-i) )) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
