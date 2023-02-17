package Oops.Polymorphism;

import Oops.Person;

public class TestData {
	public static void main(String[] args) {

		Data d = new Data();
		Person p = new Person();
		d.save("Sai");
		d.save(p);
	}

}
