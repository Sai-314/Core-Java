package Java8.Lambda;

public class TestCalculator {

	public static void main(String[] args) {

		System.out.println("------Anonymous Inner Class------");
		MyCalculator cal1 = new MyCalculator() {
			
			@Override
			public void sum(int a, int b) {
				System.out.println(a-b);
				
			}
		};
		cal1.sum(45, 678);
		
		
		System.out.println("------Using Lambda------");
		MyCalculator cal = (a, b) -> {
			System.out.println(a + b);
		};
		cal.sum(45, 678);
	}

}
