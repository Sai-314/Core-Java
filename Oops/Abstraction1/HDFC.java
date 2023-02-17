package Oops.Abstraction1;

public class HDFC extends RBI{

	public HDFC(int a, int b, int c) {
		super(a, b, c);
	}

	@Override
	public void createPPF() {
		System.out.println("HDFC: ppf account created");
		
	}

	@Override
	public void createAccount() {
		System.out.println("HDFC: new account created");
		
	}

	@Override
	public void getKYC() {
		System.out.println("HDFC: kyc successful");
		
	}

}
