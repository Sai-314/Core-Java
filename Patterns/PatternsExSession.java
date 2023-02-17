package Patterns;

public class PatternsExSession {

	public static void main(String[] args) {
		// Example-1
		// output:-
		// * * * * *

		
		for (int i = 1; i <= 5; i++) {        //i values of 1 iterates from 1 to 5 in a row
			System.out.print("*");
		}
		System.out.println();
		System.out.println();

		// Example-2
//			output:-
//			*  *  *  *  *
//			*  *  *  *  *
//			*  *  *  *  *
//			*  *  *  *  *
//			*  *  *  *  *

//			rows------i   j------starts
//			          1   5
//			          2   5
//			          3   5
//			          4   5
//			          5   5

		for (int i = 1; i <= 5; i++) {         //i values of 1 iterates from 1 to 5 in a row
			for (int j = 1; j <= 5; j++) {     //j values of 1 iterates from 1 to 5 in a column
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// Example-3
//			output:-
//			-  -  -  -  -  *  *  *  *  *
//			-  -  -  -  -  *  *  *  *  *
//			-  -  -  -  -  *  *  *  *  *
//			-  -  -  -  -  *  *  *  *  *
//			-  -  -  -  -  *  *  *  *  *
//			            space
//			rows------i   K  j------starts
//			          1   5  5
//			          2   5  5
//			          3   5  5
//			          4   5  5
//			          5   5  5

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5; k++) {
				System.out.print("-");
			}
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");

			}

			System.out.println();

		}
		System.out.println();

		// Example-4
//			output
//			*
//			**
//			***
//			****
//			*****

//			rows------i   j------starts
//			          1   1
//			          2   2
//			          3   3
//			          4   4
//			          5   5

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {   // j<=i condition prints i stars after completion 
				System.out.print("*");       // of every i loop.  =>i=1,2,3,4,5.
			} 
			System.out.println();
		}

		System.out.println();

		// Example-5
//			output
//			*****
//			****
//			***
//			**
//			*

//			rows------i   j------starts()
//			          1   5------> 5-1+1=5  (5-i+1)  --> After completion of every j loop, this 
//			          2   4------> 5-2+1=4               condition decreases its values from 5 to 1.
//			          3   3------> 5-3+1=3
//			          4   2------> 5-4+1=2
//			          5   1------> 5-5+1=1

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// Example-6
//			output
//			-----*
//			----**
//			---***
//			--****
//			-*****

//	        space
		// rows------i K j------starts
//	          1   5   5-1+1=5  (5-i+1)      1
//	          2   4   5-2+1=4               2
//	          3   3    5-3+1=3              3
//	          4   2                         4
//	          5   1                         5

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i + 1); j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// Example-7
//		output:-
//		
//		- - - - - *
//		- - - -   *
//		- - -      *
//		- -       * 
//		-         *

//		    (Row)i       k(spaces)          j(starts)

//             1       5(5-1+1)               1-----> 2*1-1=1
//             2       4(5-2+1)               3-----> 2*2-1=3
//             3       3(5-3+1)               5-----> 2*3-1=5
//             4       2(5-4+1)               7-----> 2*4-1=7
//             5       1(5-5+1)               9-----> 2*5-1=9

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i + 1); j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {   //After completion of every j loop this
				System.out.print("*");                 //condition increases to odd...
			}                                          //so it will print pyramid
			System.out.println();
		}
		System.out.println();

		// Example-8
//		output:-
//		
//		- - - - - *
//		- - - -   *
//		- - -      *
//		- -       * 
//		-         *
//      -         *
//      -         *
//      -         *
//      -         *
//      -         *

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i + 1); j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			System.out.print(" ");
			for (int j = 1; j <= 9; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// Example-9
//		output:-
//		1 2 3 4 5 
//	  1	    *
//	  2	       
//	  3	       
//	  4        
//	  5	    * 

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
