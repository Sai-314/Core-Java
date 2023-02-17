package Assignments;

public class VarArgMultInt {
	
	public static void main(String[] args) {
		System.out.println(mulInt(1, 2, 3, 4, 5));
		System.out.println(mulInt(7, 8, 3, 4, 10));
	}
	public static int mulInt(int... data) {
		int num = 1;
		for (int n : data) {
			num = num * n;
		}
		return num;

	}
}
