package MethodReference;

import Basic.This;

public class TestData {

	public static void main(String[] args) {

		//Method reference for static method
		Service s = Data::disp1;
		s.process();

		//Method reference for instance method
		Service s1 = new Data()::disp2;
		s1.process();
		
		//Method reference for constructor
		Service s2 = Data :: new;
		s2.process();
		
		System.out.println("Approach using Lambda-----");
		
		Service s3 = ()->{System.out.println("This is s3 object");};
		s3.process();
		
		s3 = ()->{System.out.println("This is second reference in s3 object");};
		s3.process();
		
		s3 = ()->{System.out.println("This is third reference in s3 object");};
		s3.process();
	}

}
