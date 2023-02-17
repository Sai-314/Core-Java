package Java8.ForEach;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {

		ArrayList<Integer> str = new ArrayList<Integer>();

		System.out.println("By using enhanced for loop----");
		str.add(6789);
		str.add(509);
		str.add(490);
		str.add(5678);
		str.add(231);

		for (Integer i : str) {
			System.out.println(i);
		}

		ArrayList<String> str1 = new ArrayList<String>();

		str1.add("Java");
		str1.add("Is");
		str1.add("A");
		str1.add("Programming");
		str1.add("Language");

		System.out.println("By using For each----");
		str.forEach((Integer data) -> {
			System.out.println(data);
		});

		System.out.println("Shorten For each----");
		// Here in For each, flower brackets also not necessary
		str.forEach(data1 -> {
			System.out.println(data1);
		});

		System.out.println("Remove method in For Each----");
		str1.removeIf(data2 -> data2.startsWith("Java"));
		System.out.println(str1);

	}

}
