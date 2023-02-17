package Static;

import java.util.Scanner;

public class Ex1 {
	
	float p;
	float t;
	//If we declare the r value here, then the separate memory will be created for r.
	static float r;
	float si;
	
	Scanner sc = new Scanner(System.in);
	
	//If we declare the value inside the block, its just load and keep some data.
	//When class is loaded at that time only it will load the data. so memory not created for this.
	static {
		r= 20.0f;
	}
	
	
	public void input() {
		System.out.println("Enter the principle amount: ");
		p = sc.nextFloat();
		System.out.println("Enter the time: ");
		t = sc.nextFloat();
//		System.out.println("Enter the rate: ");
//		r= sc.nextFloat();
	}
	public void compute() {
		si= (p*r*t)/100;
	}
	public void display() {
		System.out.println(si);
	}

}
