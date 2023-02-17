package JavaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		// 1.A stream is a sequence of objects that supports various methods which can be
		// pipelined to produce the desired result.
		
		// 2.A stream is not a data structure instead it takes input from the Collections,
		// Arrays or I/O channels.
		
		// 3.Streams don’t change the original data structure, they only provide the
		// result as per the pipelined methods.

		List<Integer> numbers = Arrays.asList(4, 2, 9, 3, 7, 8, 4, 21);

		List<Integer> n1 = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		List<Integer> n2 = numbers.stream().sorted().collect(Collectors.toList());
		List<Integer> n3 = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<Integer> n4 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		List<Integer> n5 = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		List<Integer> n6 = numbers.stream().skip(4).collect(Collectors.toList());
		List<Integer> n7 = numbers.stream().limit(4).collect(Collectors.toList());
		List<Integer> n8 = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println(numbers);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(n8);
		System.out.println(numbers);

	}

}
