package Assignments;

public class TestLambdaCalculations {

	public static void main(String[] args) throws InterruptedException {

		LambdaCalculations lc = (a, b) -> {
			System.out.println("Addition :" + (a + b));
			return null;
		};
		Runnable add = lc.calculate(345, 566);
		Thread th = new Thread(add);
		th.start();
		th.sleep(5000);

		lc = (a, b) -> {
			System.out.println("Subtraction :" + (a - b));
			return null;
		};
		Runnable sub = lc.calculate(845, 566);
		Thread th1 = new Thread(sub);
		th1.start();
		th1.sleep(5000);

		lc = (a, b) -> {
			System.out.println("Multiplication :" + (a * b));
			return null;
		};
		Runnable mul = lc.calculate(345, 566);
		Thread th2 = new Thread(mul);
		th2.start();
		th2.sleep(5000);

		lc = (a, b) -> {
			System.out.println("Division :" + (a / b));
			return null;
		};
		
		Runnable div = lc.calculate(9945, 566);
		Thread th3 = new Thread(div);
		th3.start();
		th3.sleep(5000);
	}

}
