package ExceptionHandling;

public class TestException2 {

	public static void main(String[] args) {

		String name = "10";
		int n1 = 500;
		int n2 = 10;
		int[] nums = new int[5];

		try {
			// can fail due to number format
			int num = Integer.parseInt(name);
			System.out.println(name);

			// possibility of exception if we divide by zero
			int x = n1 / n2;
			System.out.println(x);

			// Null pointer exception throws if object is not created
			System.out.println(name.length());

			// error due to invalid index out of bound
			System.out.println(nums[6]);

		} catch (ArithmeticException e) {
			System.out.println(e + " third block");

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e + " fourth block");
		} catch (NumberFormatException e) {
			System.out.println(e + " second block");
		} catch (Exception e) {
			// global exception handling -- generic exception
			System.out.println(e + " first block");
		}

	}

}
