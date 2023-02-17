package Strings;

public class StringExamples {

	public static void main(String[] args) {

		String day = "THURSDAY";
		String save = "";

		for (int i = day.length() - 1; i >= 0; i--) {
			save = save + day.charAt(i);
		}
		System.out.println(save);
		System.out.println();

		String family = "PARENTS";
		save = "";
		String save2 = "";
		// PRNS AET

		for (int i = 0; i < family.length(); i++) {
			if (i % 2 == 0) {
				save = save + family.charAt(i);
			}

			else {
				save2 = save2 + family.charAt(i);
			}
		}
		System.out.println(save + save2);

	}
}

//if(i>3 && i<=word.length()-3) {
//i--;
//save2 = save2 + word.charAt(i);
//}
//else {	
//save2 = save2 + word.charAt(i);			
//}

//if (i > 3 ) {
//// sum=i; 
////  sum=i;
////  sum--;
////	i=sum;
////sum++;
//
//save2 = save2 + word.charAt(i);
//i++;
//// sum--;
//// i++;
//}