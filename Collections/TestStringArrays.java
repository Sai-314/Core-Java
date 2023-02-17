package Collections;

public class TestStringArrays {
	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		names[0] = "Ramu";
		names[1] = "Raju";
		names[2] = "Balu";
		names[3] = "Bhuvan";
		names[4] = "Ramiii";

		
		///////Read by position
		System.out.println("Read by their position: ");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		
		System.out.println("Read all elements by enhanced for loop: ");
		for(String nam: names) {
			System.out.println(nam);
		}
		System.out.println("Read all elements by normal for loop: ");
		for(int i=0; i<=names.length-1; i++) {
			System.out.println(names[i]);
		}
	}

}
