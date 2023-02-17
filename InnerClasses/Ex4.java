package InnerClasses;

public class Ex4 {

	public static void main(String[] args) {

		Integer[] intArray = { 12, 56, 45, 67, 89 };
		String[] strArray = { "Jio", "Airtel", "Idea", "Vodafone", "Reliance" };
		Character[] charArray = { 's', 'a', 'i' };
		Double[] doubleArray = { 12.45, 56.89, 45.8, 67.1, 89.00 };

		System.out.println("--Integer Values--");
		print(intArray);
		System.out.println("--String Values--");
		print(strArray);
		System.out.println("--Character Values--");
		print(charArray);
		System.out.println("--Double Values--");
		print(doubleArray);

	}

	private static <T> void print(T[] elements) {
		for (T element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

}
