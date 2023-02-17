package Assessment2;

public class Ex1 {

	public static void main(String[] args) {

		int x = 10;
		int y = 7;

		x = x ^ y;
		System.out.println(x);
	
		
		x = x * x;
		System.out.println(x);// 100
		y = x / y;
		System.out.println(y);// 20
		x = x / y;
		System.out.println(x);// 5

		x = x ^ y;
		System.out.println(x);// 17
		y = x ^ y;
		System.out.println(y);// 5

	}

}
