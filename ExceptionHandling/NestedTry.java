package ExceptionHandling;

public class NestedTry {

	public static void main(String[] args) {

		String name = "3";
		String len = null;
		int num1 = 30;
		int num2 = 10;
		int[] arr = new int[8];

		
		//Here parent try will only check parent catch or else it throws generic exception
		//But child try will check both parent and child catch.....
		try {
			int name1 = Integer.parseInt(name);
			System.out.println(name1);
			try {
				System.out.println(num1 / num2);
				try {
					System.out.println(len.length());
				} catch (NumberFormatException e) {
					System.out.println("String can't be null");
				}

			} catch (NullPointerException e) {
				System.out.println("Number can't be zero");
			}
		} catch (ArithmeticException e) {
			System.out.println("Enter the proper number");
		} catch (Exception e) {
			System.out.println("Generic Exception");
		}
	}
}
