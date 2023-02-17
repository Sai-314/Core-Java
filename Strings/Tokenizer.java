package Strings;

import java.util.StringTokenizer;

public class Tokenizer {
	
	public static void main(String[] args) {
		
		//This method is used print words line by line as a tokens
		StringTokenizer str = new StringTokenizer("Ramu is a good boy");		
	
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			
		}
	}

}
