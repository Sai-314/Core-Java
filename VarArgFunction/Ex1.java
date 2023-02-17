package VarArgFunction;

public class Ex1 {

	public static void main(String[] args) {
		display(1,"Hii");
		display(2,"Hello", "Namasthe", "Vanakkam");
	}

	public static void display(int x, String... data) {
		for (String s : data) {
			System.out.println(x);
			System.out.println(s);
		}
	}
}