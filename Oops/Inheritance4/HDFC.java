package Oops.Inheritance4;

public class HDFC extends RBI {
	
	public void demat() {
		System.out.println("HDFC --- Demat Proccessed");
		
	}
	
	//Method Overriding
	public void processLoan() {
		super.processLoan();
		System.out.println("HDFC -- Rate of interset is 20%");
	}

}
