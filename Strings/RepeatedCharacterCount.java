package Strings;

public class RepeatedCharacterCount {

	public static void main(String[] args) {
		// a,d,i,l

		String letters = "aaaabbbbcccddddeeeee";
		int count = 0;
		int j = 0;
		for (int i = 0; i < letters.length(); i++) {
			// for(int j=0; j<=letters.length(); j++) {
			j++;
//			if (letters.charAt(i) <= letters.charAt(j)) {
//				System.out.println(letters.charAt(i));
//				count++;
//			}
			if (letters.charAt(i) != i && j > letters.charAt(i)) {
				count++;
			}

		}
		System.out.println(count);
	}

}
