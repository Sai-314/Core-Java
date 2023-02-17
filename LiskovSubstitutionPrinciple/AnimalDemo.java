package LiskovSubstitutionPrinciple;

public class AnimalDemo {

	public static void main(String[] args) {

		Animal simba = new Horse();
		simba.eat();

		Animal maximus = new Lion();
		maximus.eat();

	}

}
