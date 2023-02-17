package Oops;

public class TestCase {

	public static void main(String[] args) {

		Operations o = new Operations();

		o.show();
		o.sum(14, 16);
		o.printName(" Sai");

		String str = o.getData();
		System.out.println(str);

		String str1 = o.process("S......a");
		System.out.println(str1);

		int n = o.big(23, 99);
		System.out.println(n);
	}

}
