package ExceptionHandling;

public class TestException1 {

	public static void main(String[] args) {

		int n1 = 400;
		int n2 = 0;
		try {
			try {
				System.out.println(n1 / n2);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("block-1");
			}
		} catch (ArithmeticException e) {
			System.out.println("block-2");
		} catch (Exception e) {
			System.out.println("block-3");
		}
	}
}
