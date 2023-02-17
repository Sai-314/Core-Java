package Basic;

import java.util.Iterator;
import java.util.LinkedList;


public class Links {
	
	public static void main(String[] args) {
		
		LinkedList <String> list = new LinkedList<>();
		
		list.add("Books");
		list.add("Mobiles");
		list.add("Accessories");
		list.add("Electronics");
		list.add("Gifts");
		list.add("Groceries");
		
		for(String str: list) {
			System.out.println(str);
		}
		
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(3));
	}
	
}
