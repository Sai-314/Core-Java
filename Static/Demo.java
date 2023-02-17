package Static;

public class Demo {

	static int a, b, c;
	int x, y, z;

	static {
		a = 100;
		b = 200;
		c = 300;
	}
	{
		//Here we can initialize and access instance variables
//		x = 400;
//		y = 500;
//		z = 600;
		System.out.println("Static block");
	}

	public static void display1() {
		//We are able to access only static variables here
		//and we can't declare or access instance variables
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

	public void display2() {
		//Here we are able to access static variables , static methods and instance variables
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

	public static class LaunchDemo {
		public static void main(String[] args) {
		//	Demo.display1();
		//	Demo.display1();
			Demo demo = new Demo();//While calling constructor static block will be executed first
			Demo demo1 = new Demo();
			//demo.display2();
		}
	}
}