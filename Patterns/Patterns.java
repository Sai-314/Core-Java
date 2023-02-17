package Patterns;

public class Patterns {

	public static void main(String[] args) {

		// practiced patterns

		// i j
		// Row Column

		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
			// System.out.println("*");
		}
		System.out.println();
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
				// System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
				// System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 5; i >= 1; i--) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
				// System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

//		for(int i=1; i<=5; i++) {
//			
//			//System.out.println();
//		
//			for(int j=5; j<=i;j++) {
//				System.out.print("*");
//				
//			}
//			for(int j=i; j<=5;j++) {
//				System.out.print("");
//			}
//			
//			System.out.println();
//		}

		for (int i = 1; i <= 5; i++) {

			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 6 - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

//		for(int i = 1; i<=5; i++) {
//			
//			for(int j = 5; j<=1; j--) {
//				System.out.print(" ");
//			}
//			for(int j =6-i; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print("-");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();

	}

}
