package Collections;

import java.util.Scanner;

public class TestIntWithInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int s = scanner.nextInt();
		int size[] = new int[s];

		for (int i = 0; i <= size.length - 1; i++) {
			System.out.println("Enter the size " + (i + 1) + " :");
			int num = scanner.nextInt();
			size[i] = num;
		}

		for (int n : size) {  
			System.out.println(n);
		}
	}

}
