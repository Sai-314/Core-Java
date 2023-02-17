package Collections.List.LinkedList;

import java.util.LinkedList;

public class StackEx1 {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();

		// First In Last Out
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(50);
		ll.push(60);
		ll.push(70);

		System.out.println(ll);
		// pop will remove first value and display that value
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
	}
	

}
