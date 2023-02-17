package Static;

public class Dog {

	static int count;
	String name;
	String color;
	int cost;

	
	
	
	
	public Dog() {
		super();
		count++;
	}

	public Dog(String name, String color, int cost) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
		count++;
	}

}
