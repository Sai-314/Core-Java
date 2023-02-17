package Oops.Inheritance4;

public class TestDownCasting {

	public static void main(String[] args) {

		//doubt is what is the difference between creating object to the child class and down casting.
//		HDFC hdfc = new HDFC();
//		hdfc.demat();
//		hdfc.createAccount();
//		hdfc.processLoan();
//		System.out.println();
		
		RBI r = new HDFC();
		// r.createAccount();
		// r.processLoan();

		if (r instanceof HDFC) { // check if r is referring to HDFC

			// h and r pointing to the same object(h)
			// h is the HDFC variable
			// r is the RBI variable
			HDFC h = (HDFC) r; // Down casting

			// calling the child specific method
			h.demat();// the object is referred by RBI
			h.createAccount();
			h.processLoan();
			// ((HDFC) r).demat(); //Another type of calling
		}
	}

}

//There difference is that in one case you have two references to one object. In the other, you have two references pointing to two different objects. Consider how it works with the following:
//
//parent.kill();
//if (child.isDead()) {
//  System.out.println("He's dead");
//} else {
//  System.out.println("He lives!");
//}
//If the references point to the same object then we will print out "He's dead". If they are pointing to two different objects then we will print out "He lives!".
