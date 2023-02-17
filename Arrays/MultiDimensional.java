package Arrays;

import java.util.Scanner;

public class MultiDimensional {
	
	public static void main(String[] args) {
		 
		
		//Two Dimensional Array
		int[][][] arr = new int[2][3][3];
		
		Scanner sc = new Scanner(System.in);
		                                                
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the marks of School "+(i+1)+" and class "+(j+1)+" and Student "+(k+1)+":");
					arr[i][j][k]= sc.nextInt();
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
