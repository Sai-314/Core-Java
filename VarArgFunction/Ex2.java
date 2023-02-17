package VarArgFunction;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4, 5));
		System.out.println(sum(7, 8, 3, 4, 10));
	}

	public static int sum(int... data) {
		int sum = 0;
		for (int n : data) {
			sum = sum + n;
		}
		return sum;

	}
}
