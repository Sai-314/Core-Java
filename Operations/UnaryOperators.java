package Operations;

public class UnaryOperators {
	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;

		int e = a++;
		int f = b--;
		int g = ++c;
		int h = --d; 
		
		// b= a+++ ++a; 
		//b= a++ +++a;
		// b=a++ + ++a;

		int i = a++ + a--;
		int j = b-- + b++;
		int k = ++c + --c;
		int l = --d + ++c;

		System.out.println(a);
		System.out.println(e);
		System.out.println();
		System.out.println(b);
		System.out.println(f);
		System.out.println();
		System.out.println(c);
		System.out.println(g);
		System.out.println();
		System.out.println(d);
		System.out.println(h);
		System.out.println();
		System.out.println(i);
		System.out.println(j);
		System.out.println();
		System.out.println(k);
		System.out.println(l);
		
		//Ex1
		int x1;
		int x =5;
	        x1 = ++x - x++ + --x;
	     System.out.println(x1);
	     
	     //Ex2
	     int y = 8;
	     y += ++y + y-- + --y;
	     System.out.println(y);
	     
	     //Ex3
	     int v;
	     int z =1 ;
	     y =3;
	     x =2;
	     v = x + --z + y++ +y;
	     System.out.println(v);
	     
	     //	Ex4
	     x =2;
	     x += x++ + ++x/2;
	     System.out.println(x);
	}

}
