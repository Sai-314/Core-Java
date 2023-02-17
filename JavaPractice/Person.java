package JavaPractice;

public class Person {
	
	@Size (min = 5, value1 = "Sai", value2 = "Bhuvan")
	int id =5;
	@Size(min =10, value1 = "Sai", value2 = "Bhuvan")
	String name;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
