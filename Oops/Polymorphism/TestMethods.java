package Oops.Polymorphism;

public class TestMethods {
	public static void main(String[] args) {
		Methods p = new Methods();

		// syntax -- object.methodname(parameters)
			
		p.sum(12, 13);
		p.sum(12, 13, 15);
		p.sum(14.5f, 16);
		p.sum(8, 8.8f);
		double d = p.sum(9.1111111111111111d, 9.11111111111111111d);
		System.out.println(d);
		float f = p.sum(9.111111f, 9.1111f);
		System.out.println(f);
	}

}
