package Assignments.Maps;

import java.util.Arrays;
import java.util.List;

public class wordCount {

	public static void main(String[] args) {
//		Req: word count:
//
//			Process the i/p and print the number of times every word is repeated.
//			i/P : words
//			"java", "php", "android", "sap", 
//								"php", "java", "win", "ios", "win", "hana",
//								"android","ios","ios"
//     
//			o/p:  wordName - frequency 
//			word : java, count=2
//			word : sap, count=1
//			word : android, count=2
//			word : php, count=2
//			word : ios, count=3
//			word : hana, count=1
//			word : win, count=2
		// ArrayList<String> arr = new ArrayList<String>();
//       inputWords.containsAll(inputWords) && 
		String[] arr = { "java", "php", "android", "sap", "php", "java", "win", "ios", "win", "hana", "android", "ios",
				"ios" };
		List<String> inputWords = Arrays.asList(arr);

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!inputWords.contains(arr[i])) {
				// inputWords.addAll(Arrays.asList());
				// inputWords.add(inputWords);;

				// System.out.println(inputWords.get(i));
				// System.out.println(words);

//					if((arr[i]).equals(inputWords)) {
//						count++;
//						System.out.println(inputWords.get(i) + "---" + count);
//					}
//					else {
//						inputWords.add(arr[i]);
//						System.out.println(inputWords.get(i) + "---" + count);
//					}
//				List<String> word = inputWords;
//				inputWords.addAll(word);
				count++;
				inputWords.add(arr[i]);
				
				 System.out.println(inputWords);
			}
//				else {
//					count++;
//					System.out.println(inputWords.get(i) +"----"+ count);
//				}
		}
		
		for (String w : inputWords) {
			System.out.println(w);
		}

//			if (!inputWords.contains(i)) {
//				inputWords
//			}
		// System.out.println(inputWords.get(i) +"---"+ count);
	}

//		for(List<String> inputWord : Arrays.asList(inputWords)) {
//			System.out.println(inputWord);
//		}

	// System.out.println(inputWords.get(1) +"-----"+ count);
	// System.out.println(inputWords.contains("ios"));

}
