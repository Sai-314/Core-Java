package Java11;

import java.math.BigDecimal;

public class ManageCurrency {

	public static void main(String[] args) {
		
		
		// Using Big Decimal
		// First value in a double data type
		// Second convert double to toString method
		// Then create Big decimal object and store that value
		// Then again create Big decimal object and add that values in a Big decimal
		// object
		double value = 0.056;

		System.out.println(value);

		double psum = value + value + value;
		System.out.println(psum);

		String strValue = Double.toString(value);
		System.out.println(strValue);

		BigDecimal bigValue = new BigDecimal(strValue);
		System.out.println(bigValue);

		BigDecimal bigD = bigValue.add(bigValue).add(bigValue).add(bigValue);
		System.out.println(bigD);
		
		//Converting again to double
		double str = bigD.doubleValue();
		System.out.println(str);

	}

}
