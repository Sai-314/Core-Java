package Oops.Polymorphism;

import Oops.Person;

//Overloading
public class Data {
	public void save(String str) {
		System.out.println("Save String "+str);

	}

	public void save(Person p) {
		System.out.println("Save Person");
	}

}
