package ExceptionHandling;

import java.util.Scanner;

//main(), fun(), fun2(), fun3()

//main()----> fun3()---->fun2()----->fun()//validation

//div of two num.

//Exception propagation:-
//------------------------
//
//-->if a exception has occurred and there is no user define handler present in that 
//activation record and the run time system will no immediately hand over the 
//exception obj to default handler. Rather that exception object will 
//propagated o check if there is any handler provided in the remaining activation records.
//
//-->if there are no handler present in the activation records then exception obj 
//will be hand over to default.
//
//
//-->if there is any handler provided in any of the activation records the 
//the exception obj will be give to that handler

class Demo4 {
	public void fun() {
		System.out.println("System connected");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		int c = num1 / num2;

		System.out.println(c);
		System.out.println("Connection terminated");
	}
}

class Demo5 {
	public void fun2() {
		Demo4 d1 = new Demo4();
		d1.fun();
	}
}

class Demo6 {
	public void fun3() {
		Demo5 d2 = new Demo5();
		try {
			d2.fun2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class TestException7 {

	public static void main(String[] args) {

		Demo6 d3 = new Demo6();
		d3.fun3();

	}

}
