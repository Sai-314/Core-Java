package LiskovSubstitutionPrinciple;

public class Horse extends Herbivore {

	@Override
	public void eatGrass() {
		System.out.println("I'm Horse and I eat Grass");

	}

}
