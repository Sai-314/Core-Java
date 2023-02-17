package Oops;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int x =100;
		System.out.println(x);
		
		modify(x);
		System.out.println(x);
	}
	public static void modify(int x) {
		x= 900;
		System.out.println(x);
	}

	//If the method 1 calls method 2 by passing primitive data types like int, double, float.
	//and method 2 is modifying primitive variables then it will not impact on method 1
	
	//But if we pass objects then it will impact.
	
}
