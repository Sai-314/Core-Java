package Cloning;

public class TestEmployee {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		//Here what happening is after creating e1 object we are getting data from e1 to e2 
		//by cloning. but when we reinitialize e1 object data then e2 object data will not change.
		//because both are independent.
		//But we can able to modify e2 object data by set methods.
		
		Employee e1 = new Employee();
		e1.setId(34);
		e1.setName("Diya");

		System.out.println(e1.getId());
		System.out.println(e1.getName());
		
		System.out.println();
		Employee e2 = (Employee) e1.clone();
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		System.out.println();
		
		e1.setId(44);
		e1.setName("Bhanu");
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println();
		
		System.out.println(e2.getId());
		System.out.println(e2.getName());
	}

}
