package Oops;

public class Operations {

	public void show() {
		System.out.println("This is show method");
	}

	public void printName(String name) {
		System.out.println("Mr." + name);
	}

	public void sum(int a, int y) {
		int z = a + y;
		System.out.println(z);
	}

	public String getData() {
		return "Hi hello namaste";
	}

	public String process(String name) {
		return "Mrs. " + name;
	}

	public int big(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}

	}
}
