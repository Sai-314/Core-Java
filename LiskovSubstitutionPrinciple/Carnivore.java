package LiskovSubstitutionPrinciple;

public abstract class Carnivore extends Animal {

	@Override
	public void eat() {
		this.eatMeat();
	}

	public abstract void eatMeat();

}
