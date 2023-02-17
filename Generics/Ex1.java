package Generics;

public class Ex1 {

	public static void main(String[] args) {

		show("ISRO");
		show("NASA");
		show("DRDO");
		show("HAL");
	}

	public static <T> void show(T organisation) {
		System.out.println(organisation);
	}

}
