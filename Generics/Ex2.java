package Generics;

public class Ex2 {

	public static void main(String[] args) {

		System.out.println(getData(133));
		System.out.println(getData("Sree"));
		System.out.println(getData(345.54f));
		System.out.println(getData("Software"));

	}

	//Here we are returning string data type
	public static <T> String getData(T data) {

		return "Data is " + data;

	}

}
