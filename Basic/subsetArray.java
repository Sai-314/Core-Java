package Basic;

public class subsetArray {
	public static void main(String[] args) {

		String str = "MAGIC";
		int numberOfChar = str.length();

		int temp = 0;
                                            
		String subsetArray[] = new String[numberOfChar * (numberOfChar + 1) / 2];

		for (int i = 0; i < numberOfChar; i++) {
			for (int j = i; j < numberOfChar; j++) {
				subsetArray[temp] = str.substring(i, j + 1);
				temp++;
			}
		}
		System.out.println("All the subsets of the given string");
		for (int i = 0; i< subsetArray.length; i++) {
			System.out.println(subsetArray[i]);
		}
	}

}

































