package Assignments;

public class FindBigNumbers {

	public int big(int x, int y, int z) {
		if (x > y && x > z) {
			return x;
		} else if (y > x && y > z) {
			return y;
		} else {
			return z;
		}

	}

	public static class FindBig {
		public static void main(String[] args) {
			FindBigNumbers num = new FindBigNumbers();

			int n = num.big(20, 100, 10);
			System.out.println(n);
		}
	}
}