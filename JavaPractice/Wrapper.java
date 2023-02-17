package JavaPractice;

public class Wrapper {

	public static void main(String[] args) {

		// The wrapper class in Java provides the mechanism to convert primitive into
		// object and object into primitive.

		// autoboxing and unboxing feature convert primitives into objects and objects
		// into primitives automatically. The automatic conversion of primitive into an
		// object is known as autoboxing and vice-versa unboxing.

		// int Integer
		// boolean Boolean

		// Collection Framework: Java collection framework works with objects only. All
		// classes of the collection framework (ArrayList, LinkedList, Vector, HashSet,
		// LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects
		// only.

		int n1 = 67;
		Integer num1 = new Integer(n1);
		int n3 = num1; //unboxing
		int n2 = num1.intValue();
		Integer n4 = n1; //autoboxing

		
		String s1 = "Sai";
		String s2 = String.valueOf(n1);

	}

}
