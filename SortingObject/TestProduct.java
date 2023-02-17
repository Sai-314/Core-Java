package SortingObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> proObj = new ArrayList<Product>();

		proObj.add(new Product(5, "Dell", 50000));
		proObj.add(new Product(3, "Asus", 50000));
		proObj.add(new Product(4, "Apple", 50000));
		proObj.add(new Product(1, "Lenovo", 50000));
		proObj.add(new Product(2, "MacBook", 50000));

		proObj.forEach(p -> {
			System.out.println(p);
		});

		System.out.println("Ascending based on ID");
		Comparator<Product> compare = (p1, p2) -> p1.id - p2.id;
		List<Product> list = proObj.stream().sorted(compare).collect(Collectors.toList());
		list.forEach(p -> {
			System.out.println(p);
		});

		System.out.println("Descending based on ID");
		compare = (p1, p2) -> p2.id - p1.id;
		list = proObj.stream().sorted(compare).collect(Collectors.toList());
		list.forEach(p -> {
			System.out.println(p);
		});

		System.out.println("Sorting for Strings");
		compare = (p1, p2) -> p1.name.compareTo(p2.name);
		list = proObj.stream().sorted(compare).collect(Collectors.toList());
		list.forEach(p -> {
			System.out.println(p);
		});
	}

}
