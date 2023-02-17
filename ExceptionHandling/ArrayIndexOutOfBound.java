package ExceptionHandling;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		int[] arr = new int[6];
		arr[5] = 9;

		try {
			System.out.println(arr[6]);
		} catch (NumberFormatException e) {
			System.out.println("catch block-1");
		} catch (ArithmeticException e) {
			System.out.println("catch block-2");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter the proper size");

//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("Enter the proper size2");
		}
		// If it throws ArrayIndexOutOfBoundsException then we should place that
		// exception before the generic exception or else it throws compilation error.
		catch (Exception e) {
			System.out.println("Generic exception");
		}
	}
}
