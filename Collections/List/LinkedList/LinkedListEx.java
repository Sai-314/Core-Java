package Collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<Integer> a = new LinkedList<Integer>();

		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);

		System.out.println(a.getFirst());
		System.out.println(a);
		System.out.println(a.getLast());
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a);
		System.out.println(a.peekFirst());
		System.out.println(a);
		System.out.println(a.peekLast());
		System.out.println(a);
		System.out.println(a.poll());
		System.out.println(a);
		System.out.println(a.pollFirst());
		System.out.println(a);
		System.out.println(a.pollLast());
		System.out.println(a);

	}

}
