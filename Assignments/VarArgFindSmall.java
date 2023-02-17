package Assignments;

public class VarArgFindSmall {
	public static void main(String[] args) {

		FindSmall(4, 5, 300, 40, 400);
	}

	public static void FindSmall(int... data) {

		int small = data[0];
		//System.out.println(data[4]);
		for (int i = 0; i <= data.length - 1; i++) {
			if (data[i] < small) {
				small = data[i];
			}
		}
		System.out.println(small);
	}
}
