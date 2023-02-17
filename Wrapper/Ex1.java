package Wrapper;

public class Ex1 {

	public static void main(String[] args) {

		Integer i = new Integer(699);
		int n1 = i.intValue(); // Converting integer object to int
		float f1 = i.floatValue(); // Converting integer object to float
		System.out.println(n1);
		System.out.println(f1);
		int n3 = 444;
		float f4 = 677777.77f;

		Integer i3 = Integer.valueOf(n3);
		System.out.println(i3);

		// Convert int/float/double value to String

		int n2 = 800;
		float f2 = 4545.345636f;
		double d2 = 56.345353535353d;

		String s2 = String.valueOf(n2); // Converted int to string
		String s3 = String.valueOf(f2); // Converted float to string
		String s4 = String.valueOf(d2); // Converted double to string

		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("Hai this is me");
	}

}
