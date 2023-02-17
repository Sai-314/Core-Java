package Oops.Abstraction;

public abstract class RBI {
	
	public void createAccount() {
		System.out.println("RBI: Account created");
	}
	public void processLoan() {
		System.out.println("RBI: Loan processed");
	}
	
	//Its not mandatory to use public keyword. if we don't use public it will be default
	public abstract void createPPF();
}
