package Modifiers2;

import Modifiers1.info;

public class info3 {
	public void show(){
		//access everything within class
		info i = new info();
		System.out.println(i.id);
		//System.out.println(i.name); // private cannot be accessed outside the class.
		//System.out.println(i.age); // protected cannot be accessed outside the pkg
		//System.out.println(i.count); // default cannot be accessed outside the pkg
	}
}
