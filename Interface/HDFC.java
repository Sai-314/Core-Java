package Interface;

public class HDFC extends MyBank implements WorldBank, RBI {

	@Override
	public void ppf() {
		System.out.println("HDFC ppf method");
		System.out.println(rateOfInterest);
	}

	@Override
	public void draft() {
		System.out.println("HDFC draft method");
	}
 
	@Override
	public void display() {
		System.out.println("HDFC display method");
	}

	@Override
	public void show() {
		System.out.println("HDFC show method");
	}

	// Method from axis bank
	@Override
	public void applyLoan() {
		System.out.println("HDFC loan granted");
	}

	@Override
	public void demat() {
		System.out.println("HDFC demat account");

	}

}
