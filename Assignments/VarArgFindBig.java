package Assignments;

public class VarArgFindBig {
	public static void main(String[] args) {

		FindBig(910, 440, 300, 1840, 5580, 34867666);
	}

	public static void FindBig(int ...data) {

		int big = data[0];
		for (int i = 0; i <= data.length - 1; i++) {
			if (data[i] > big) {
				big = data[i];
				// System.out.println(big);
			}
		}
		System.out.println(big);
	}
}
