package InnerClasses;

public class Outer {
	
	private int data = 56;
	public void print() {
		System.out.println(data);
	}
	class Inner{
	    void msg() {
	    	//here we are accessing outer class instance variable
	    	System.out.println("Outer class data is "+ data);
	    }
	}

}
