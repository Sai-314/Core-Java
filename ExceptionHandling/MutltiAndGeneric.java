package ExceptionHandling;

public class MutltiAndGeneric {

	public static void main(String[] args) {

		String name = "";
		int n1 = 500;
		int n2 = 1;
		int[] nums = new int[5];

		// can fail due to number format
		try {
			int num = Integer.parseInt(name);

			System.out.println("first block");

			// possibility of exception if we divide by zero
			int x = n1 / n2;
			System.out.println(x);

			// Null pointer exception throws if object is not created
			System.out.println(name.length());

			// error due to invalid index out of bound

			System.out.println(nums[5]);
		} catch (NumberFormatException | ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			// common exception handling for number format/arithmetic/null pointer and index out of bound
			System.out.println("client error: " + e.getMessage());
		} catch (Exception e) {
			// global exception handling
			System.out.println("server error: " + e.getMessage());
		}
	}

}
