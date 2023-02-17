package Oops.TypeCasting;

public class UpCasting {
	public static void main(String args[]) {

		Parent obj1 = new Child();
		Parent obj2 = new Child();
		obj1.PrintData();
		obj2.PrintData();
	}
}