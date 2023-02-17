package Assignments;

public class CustomerTest {

	public static void main(String[] args) {

		Customer de = getData(1,"Sai",24,6,71);	
		show(de);
	}
	
	public static void show(Customer ce) {
		System.out.println("Id : "+ce.id);
		System.out.println("Name : "+ce.name);
		System.out.println("Age : "+ce.age);
		System.out.println("Height : "+ce.height);
		System.out.println("Weight : "+ce.weight);
	}
	
	
	public static Customer getData(int id, String name, int age, int height, int weight) {
		Customer c = new Customer();
		c.id = id;
		c.name = name;
		c.age = age;
		c.height = height;
		c.weight = weight;
		System.out.println(c.name);//These sysout values will be returned even if we didnt print its values 
		System.out.println("Fahad");
		return c;

	}
}
