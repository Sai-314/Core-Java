package ExceptionHandling;

public class NullPointer {

	public static void main(String[] args) {

		// String str =null;
		String str = "Ram";

		
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Enter the proper input: ");
		}
	}
}
