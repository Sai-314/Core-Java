package Collections;


public class TestIntArrays {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		numbers[0] = 45;
		numbers[1] = 56;
		numbers[2] = 89;
		numbers[3] = 34;
		numbers[4] = 11;

		
		///////Read by position
		System.out.println("Read by their position: ");
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		///Read and print at a time
		//Enhanced for loop
		//approach-1
		System.out.println("Read all elements by enhanced for loop: ");
		for(int num: numbers) {
			System.out.println(num);
		}
		
		//Normal for loop
		//approach-2
		System.out.println("Read all elements by normal for loop: ");
		for(int i=0; i<=numbers.length-1; i++) {
			System.out.println(numbers[i]);
		}

	}

}
