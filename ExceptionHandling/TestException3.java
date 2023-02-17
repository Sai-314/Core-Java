package ExceptionHandling;

public class TestException3 {

	public static void main(String[] args) {

		String name = "";
		int n1 = 500;
		int n2 = 1;
		int[] nums = new int[5];

		// can fail due to number format
		try {
			int num = Integer.parseInt(name);
		} catch (NumberFormatException e) {
			System.out.println("first block");
		}

		// possibility of exception if we divide by zero
		int x = n1 / n2;
		System.out.println(x);

		// Null pointer exception throws if object is not created
		System.out.println(name.length());

		// error due to invalid index out of bound
		try {
			System.out.println(nums[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("second block");
		}
	}

}
