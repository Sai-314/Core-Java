package Operations;

public class Validate {
	
	public static void main(String[] args) {
		boolean val = ValidateAge(20);
		System.out.println(val);
	}

	public static boolean ValidateAge(int age) {

//		boolean valid;
//		if(x>18) {
//			valid = true;
//		}
//		else {
//			valid = false;
//		}
		
		//By using ternary operator
		boolean valid = age>18 ? true : false;
		return valid;
	}

}
