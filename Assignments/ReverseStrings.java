package Assignments;

import java.util.Scanner;

public class ReverseStrings {

	public static void main(String[] args) {

		// Assignment -- KNOWLEDGE

		String word = "KNOWLEDGE";
		String save = "";
		String save2 = "";
		// WONK LEDGE

		for (int i = word.length() - 1; i >= 0; i--) {
			if (i <= 3) {
				save = save + word.charAt(i);
			}
			if (i == 4) {
				save2 = save2 + word.substring(4);
			}

		}
//		for (int i = 0; i < word.length(); i++) {
//			if (i > 3) {
//				save2 = save2 + word.charAt(i);
//			}
//		}
		System.out.println(save + save2);

		System.out.println();

		// Assignment -- YOU ARE WHO

		String word1 = "HOW ARE YOU";
		save = "";
		save2 = "";
		String save3 = "";

		for (int i = 0; i < word1.length(); i++) {
			if (i > 7) {
				save = save + word1.charAt(i);
			}
			if (i > 2 && i < 8) {
				save2 = save2 + word1.charAt(i);
			}
			if (i >= 0 && i < 3) {
				save3 = save3 + word1.charAt(i);
			}

		}
		System.out.println(save + save2 + save3);
		System.out.println();

		// Assignment -- WOH ERA UOY

		String word2 = "HOW ARE YOU";
		save = "";
		save2 = "";
		save3 = "";

		for (int i = word2.length() - 1; i >= 0; i--) {
			if (i < 3) {
				save = save + word2.charAt(i);
			}
			if (i > 2 && i < 8) {
				save2 = save2 + word2.charAt(i);
			}
			if (i >= 8 && i <= 11) {
				save3 = save3 + word2.charAt(i);
			}

		}
		System.out.println(save + save2 + save3);
		System.out.println();

		// Another Approach for reversing strings

		Scanner sc = new Scanner(System.in);

		// System.out.println("Enter the String: ");

		// String wish = sc.next();
		String wish = "Happy Birthday";
		String[] arr = wish.split(" ");
		String temp = "";

		for (int i = 0; i < arr.length; i++) {

			String result = reverse(arr[i]);
			temp += result + " ";
		}
		System.out.println(temp);
		System.out.println();

	}

	public static String reverse(String s) {
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			r += s.charAt(i);
		}
		return r;

	}

}