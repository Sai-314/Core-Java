package Assignments;

import java.util.Scanner;

public class ZigZagArray {

	public static void main(String[] args) {

		int[][][] a = new int[2][][];
		a[0] = new int[3][];
		a[1] = new int[2][];           //		output:-
                                       //		-----
		a[0][0] = new int[3];          //		11  12  13 
		a[0][1] = new int[1];          //	1	32
		a[0][2] = new int[3];          //		21  21  23
                                       //		22  21  22
		a[1][0] = new int[3];          //	2	21
		a[1][1] = new int[1];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.println("Enter the Numbers: ");
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}

	}

}
