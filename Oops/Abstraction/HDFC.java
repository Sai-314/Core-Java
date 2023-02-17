package Oops.Abstraction;

public class HDFC extends RBI {

	@Override
	//While extending child class overriding parent class abstract method is mandatory.
	public void createPPF() {
		System.out.println("HDFC: PPF account created");
		
	}
	public void goal() {
		System.out.println("goal");
	}

}
