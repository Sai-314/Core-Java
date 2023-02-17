package Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListMethodEx {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		a.add("Sai");
		a.add(12);
		a.add(20);
		a.add(30);
		a.add(40);

		System.out.println(a);

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		System.out.println(a1);

		a.addAll(2, a1);
		System.out.println(a);

		a.removeAll(a1);
		System.out.println(a);

		a.add(100);
		System.out.println(a);

		// didn't understand
//		a.retainAll(a1);
//		System.out.println(a);

		System.out.println(a.contains(20));
		System.out.println(a.getClass());
		a.ensureCapacity(3);
		System.out.println(a.get(4));

		System.out.println(a.set(3, 676));
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.indexOf(676));
		System.out.println(a.subList(2, 5));

	}

}
