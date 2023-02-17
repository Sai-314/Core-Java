package Strings;

public class Ex1 {

	public static void main(String[] args) {
		char[] ch = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
		System.out.println(ch[2]);
		String s1 = "SAI";
		String s2 = "SAI";
		int k = 40;
		String s11 = k + s2;
		System.out.println(s11);
		// String string = new String("ddd");
		// String s10 = s1+s2;
		// System.out.println(s10);

		if (s1 == s2) { // They become equal because it creates same memory space and same id's
			System.out.println("Strings are equal"); // for both the variables
		} else {
			System.out.println("Strings are not equal");
		}

		System.out.println();

		if (s1.equals(s2)) {// They become equal because it compares the values
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		System.out.println();

		String s3 = new String("SAI");
		String s4 = new String("SAI");

		if (s3 == s4) { // They not become equal because they are objects and comes under non-constant
						// pool
			System.out.println("Strings are equal"); // so it creates two different memories and
		} // two different id's
		else {
			System.out.println("Strings are not equal");
		}

		System.out.println();

		if (s3.equals(s4)) {// They become equal because it compares only the values but not id's
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		System.out.println();

		if (s1 == s3) { // They not become equal because one is object and one is string
			System.out.println("Strings are equal"); // so it creates two different memories and
		} // two different id's
		else {
			System.out.println("Strings are not equal");
		}

		System.out.println();

		String s5 = "Sita";
		String s6 = "Ramam";

		String s7 = s5 + s6;
		String s8 = s5 + s6;

		if (s7 == s8) { // Strings not become equal if we use concatenation. so it creates new id's and
						// new
			System.out.println("Strings are equal");// memory space and comes under non-constant pool
		} else {
			System.out.println("Strings are not equal");
		}

		int a = 9;
		int b = 9;

		if (a == b) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}

}
