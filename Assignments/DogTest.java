package Assignments;

public class DogTest {

	public static void main(String[] args) {

		System.out.println(Dog.count);
		Dog d = new Dog();
		System.out.println(Dog.count);
		Dog d4 = new Dog();
		System.out.println(Dog.count);
		Dog d1 = new Dog("Brownie", "Brown", 5000,1);
		System.out.println(Dog.count);
		Dog d2 = new Dog("Brownie", "Brown", 5000,1);
		System.out.println(Dog.count);
		Dog d3 = new Dog("Brownie", "Brown", 5000,1);
		System.out.println(Dog.count);
	}

}
