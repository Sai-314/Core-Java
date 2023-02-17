package Basic;

public class This {

	int id = 3;
	String name = "Priya";
	int age = 24;

	public This(int id, String name, int age) {
		super();
		// Here we are assigning method variable values to instance variable values
//		this.id = id;
//		this.name = name;
//		this.age = age;

		//But here we are assigning instance variable values to method variable values
		id = this.id;
		name = this.name;
		age = this.age;
	}

}
