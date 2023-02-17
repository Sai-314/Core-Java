package Assignments;

public class Dog {

	static int count;
	String name;
	String color;
	int cost;

    //This is also a static block so no need of mentioning static before the block
	{
		count++;
	}

	public Dog() {

	}

	public Dog(String name, String color, int cost, int count) {
		this.name = name;
		this.color = color;
		this.cost = cost;
	}

}
