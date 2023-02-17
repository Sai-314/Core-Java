package Patterns;

public class SpaceInPyramidBase {

	
	public static void main(String[] args) {
		
		//Assignment
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i + 1); j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//System.out.println();
		
		for(int i=1;i<=5; i++) {
			System.out.print("-");
			for(int j=1; j<=9; j++) {
				if((i!=1)&&(i!=5) && (j>=4)&&(j<=6)){
				System.out.print(" ");
				}			
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
	
	
//	(i>=4)&&(i<=2) || 
	//(i!=1)&&(i!=5) &&
}
