package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(6, 7, 8, 33, 5, 6, 2, 1, 5);

		System.out.println(numbers);

		//Number square
		List<Integer> listNumSq = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(listNumSq);

		//Even numbers
		List<Integer> listEven = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(listEven);

		//Odd numbers
		List<Integer> listOdd = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(listOdd);

		//Descending numbers
		List<Integer> listDesc = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(listDesc);
		
		//Ascending numbers
		List<Integer> listAsc = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(listAsc);
		 
		//Removing Duplicates by distinct method
		List<Integer> listDistinct = numbers.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(listDistinct);
		
		List<Integer> listLimit = numbers.stream().sorted().limit(5).collect(Collectors.toList());
		System.out.println(listLimit);
		
		List<Integer> listSkip = numbers.stream().sorted().skip(6).collect(Collectors.toList());
		System.out.println(listSkip);
		
		System.out.println(numbers);
		
		
		List<String> names = Arrays.asList("Sai","Ram","Sai");
		
		List<String> namList = names.stream().filter(s-> s.startsWith("S")).collect(Collectors.toList());
		System.err.println(namList);
		
		List<String> namListt = names.stream().distinct().filter(s-> s.startsWith("S")).collect(Collectors.toList());
		System.err.println(namListt);

	}

}
