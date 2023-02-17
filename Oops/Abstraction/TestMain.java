package Oops.Abstraction;


public class TestMain {
	
	public static void main(String[] args) {
		
		//By this we get the three methods
		HDFC hdfc = new HDFC();
		hdfc.createAccount();
		hdfc.processLoan();
		hdfc.createPPF();
		hdfc.goal();
		System.out.println();
		
		//By this also we will get all the three methods
		RBI rbi = new HDFC();
		rbi.createAccount();
		rbi.processLoan();
		rbi.createPPF();
		
		
	}

}
