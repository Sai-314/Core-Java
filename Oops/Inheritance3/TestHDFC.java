package Oops.Inheritance3;


public class TestHDFC {
	
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		
		hdfc.createAccount();//Inherited from RBI class
		hdfc.demat();  // child specific method in child class
		hdfc.processLoan();// HDFC class
	}
	
	

}
