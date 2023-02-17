package Oops.Abstraction1;

public class TestMain {

	public static void main(String[] args) {

		HDFC hdfc = new HDFC(10,20,30);
		hdfc.createAccount();
		hdfc.createPPF();
		hdfc.getKYC();
		System.out.println(hdfc.getA());
		System.out.println(hdfc.getB());
		System.out.println(hdfc.getC());
		System.out.println();
		
		
		RBI rbi = new HDFC(40,50,60);
		rbi.createAccount();
		rbi.createPPF();
		rbi.getKYC();
		System.out.println(rbi.getA());
		System.out.println(rbi.getB());
		System.out.println(rbi.getC());
	}

}
