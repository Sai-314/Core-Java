package Operations;

public class AssignmentOperators {
public static void main(String[] args) {
	
	int a = 10;

	int b;

	b = a;
	System.out.println(b);// 10

	b += a;//(b = b+a)
	System.out.println(b);// 20

	b = +a;
	System.out.println(b);// 10

	b = -a;
	System.out.println(b);// -10

	b -= a;// b = b-a // =-10 -10 
	System.out.println(b);// -20

	b *= a; // b = b*a
	System.out.println(b);//-200

	b = a;	
	System.out.println(b);// 10

	b /= a; // b = b/a
	System.out.println(b);//1
}
}
