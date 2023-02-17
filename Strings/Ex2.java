package Strings;

public class Ex2 {

	public static void main(String[] args) {
		String s2 = "sai;";
		String s1 = String.format("sai %s", s2);
		System.out.println(s1);
		String s = "Java Is A Programming Language";

		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.contains("A"));
		System.out.println(s.indexOf("g"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(10));
		System.out.println(s.substring(10, 21));
		System.out.println(s.startsWith("Java"));
		System.out.println(s.endsWith("Java"));
		String[] arr = s.split("a");

		for (String w : arr) {
			System.out.println(w);
		}

	}

}
