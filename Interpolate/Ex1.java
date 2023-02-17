package Interpolate;

public class Ex1 {

	public static void main(String[] args) {

		String item = "T-shirt";
		int size = 34;
		float price = 34534.56f;
		String color = "red";

		String template = "Clothing item: %s, size: %d, price: %f, color: %s";
		String itemString = String.format(template, item, size, price, color);
		System.out.println(itemString);

	}

}
