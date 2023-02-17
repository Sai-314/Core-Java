package Arrays;

import java.util.Scanner;

public class OneDimensional {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
	    for(int i=0; i<=arr.length-1; i++) {
	    	System.out.println("Enter the marks of subject "+ (i+1)+ ":");
	    	arr[i] = sc.nextInt();
	    }
	    for(int i=0; i<=arr.length-1; i++) {
	    	System.out.println(arr[i]);
	    }
	}

}
