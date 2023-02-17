package Oops.HasRelationship;

public class Person {
	
	int id;
	String name;
	int age;
    Address add;
	public Person(int id, String name, int age, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAdd() {
		return add;
	}
 

}
