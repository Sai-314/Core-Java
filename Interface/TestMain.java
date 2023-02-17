package Interface;

public class TestMain {

	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.display();
		hdfc.draft();
		hdfc.ppf();
		hdfc.show();
		hdfc.applyLoan();
		hdfc.demat();
		hdfc.showBalance();
	}

}
