package Assignments;

public class VarArgMultFloat {
	public static void main(String[] args) {
		System.out.println(mulFloat(41.2f, 52.3f, 13.6f));
		System.out.println(mulFloat(7.7f, 8.99f, 34.9f, 45.1f, 10.1f));
	}

	public static Float mulFloat(Float... data) {
		Float num = 1.0f;
		for (Float n : data) {
			num = num * n;
		}
		return num;

	}
}
