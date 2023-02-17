package Java8.Lambda;

public class TestCalculator2 {

	public static void main(String[] args) {

		
		System.out.println("Using Annnonymous Inner Class----");
		MyCalculator2 cal = new MyCalculator2() {

			@Override
			public int calculate(int a, int b) {

				return a + b;
			}
		};
		System.out.println(cal.calculate(78, 108));

		
		System.out.println("Using Lambda Expressions----");
		MyCalculator2 cal1 = (a, b) -> {
			return a + b;
		};
		MyCalculator2 cal2 = (a, b) -> {
			return a - b;
		};
		MyCalculator2 cal3 = (a, b) -> {
			return a * b;
		};
		MyCalculator2 cal4 = (a, b) -> {
			return a / b;
		};
		System.out.println(cal1.calculate(345, 450));
		System.out.println(cal2.calculate(345, 450));
		System.out.println(cal3.calculate(345, 450));
		System.out.println(cal4.calculate(945, 450));
		
		System.out.println("Without return statement-----");
		
		MyCalculator2 cal5 = (int a, int b) -> (a+b);
		System.out.println(cal5.calculate(800, 900));
		
	}

}
