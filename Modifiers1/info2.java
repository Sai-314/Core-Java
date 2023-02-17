package Modifiers1;

public class info2 {
	public void show(){
		//access everything within class
		info i = new info();
		System.out.println(i.id);
		//System.out.println(i.name); // private cannot be accessed outside the class.
		System.out.println(i.age);
		System.out.println(i.count);
	}
}
