package JavaPractice;

public class VarArgFunction {

	public static void display(int num, String... names) {
		System.out.println(num);
		for (String nam : names) {
			System.out.println(nam);
		}
	}

	public static void main(String[] args) {
		display(1, "Sai", "Swaha");
	}

}
