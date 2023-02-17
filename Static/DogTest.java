package Static;

public class DogTest {

	public static void main(String[] args) {

		System.out.println(Dog.count);
		Dog d = new Dog();
		System.out.println(Dog.count);
		Dog d1 = new Dog("Brownie", "Brown", 5000);
		System.out.println(Dog.count);
	}

}
