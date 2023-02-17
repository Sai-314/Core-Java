package Oops.Polymorphism;

public class Methods {

	//Overloading
	
	// No of arguments
	public void sum(int x, int y) {
		System.out.println(x + y);
	}

	public void sum(int x, int y, int z) {
		System.out.println(x + y + z);
		System.out.println("dfhdf");
	}

	public static int add(int a, int b) {
		int c = a + b;
		System.out.println("bala");
		return c;
	}

	
	// order of arguments
	public void sum(int d, float e) {
		System.out.println(d + e);
	}

	public void sum(float e, int d) {
		System.out.println(d + e);
	}

	
	// Data type of arguments
	public float sum(float f, float g) {
		float result = f+g;
		return result;
	}

	public double sum(double f, double g) {
		double result = f+g;
		return result;
	}
	
}
