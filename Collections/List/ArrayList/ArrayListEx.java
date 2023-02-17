package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the names: ");
			int str = scanner.nextInt();
			///String str1= str+"";
			String string ="END";
			if (string.equals(str)) {
				break;
			}
			if (!a.contains(str)) {
				a.add(str);
			}
		}
		for (int s : a) {
			System.out.println(s);
		}
	}

}
