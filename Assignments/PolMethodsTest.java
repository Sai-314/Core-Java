package Assignments;

public class PolMethodsTest {
	
	public static void main(String[] args) {
		
		PolMethods p = new PolMethods();
		
		//If a method expects long, then the method can be called by passing int or long
		p.sum(99999999999999999l, 999999999999999l);
		//If a method expects float, then the method can be called by passing int or float
		p.sum(3444444, 3444.56f);
		//If a method expects double, then the method can be called by passing int or float or double.
		p.sum(45.5555555555555555d, 23.3333333333f);
	}

}
