package SortingObject;

import java.util.Comparator;

public class Employee1 implements Comparator<Employee1> {

	String name;
	int id;
	int age;

	public Employee1(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	
	//Here it is going to compare the strings and objects
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.name.compareTo(o2.name);
	}

}
