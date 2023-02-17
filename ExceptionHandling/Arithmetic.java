package ExceptionHandling;


public class Arithmetic {

	public static void main(String[] args) {

		int a = 90;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("20/0 is not possible");
		}	
		catch(ArithmeticException e){
			System.out.println("90/0 is not possible");
		}
		catch(Exception e) {
			System.out.println("80/0 is not possible");
		}
	}

}
