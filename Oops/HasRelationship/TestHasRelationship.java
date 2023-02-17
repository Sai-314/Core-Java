package Oops.HasRelationship;

public class TestHasRelationship {

	public static void main(String[] args) {
		Address personAddress = new Address("1st street", "Bangalore", "AP", "India", 6676767);

		Person p = new Person(1, "Sai", 24, personAddress);
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAdd().street);
		System.out.println(p.getAdd().city);
		System.out.println(p.getAdd().state);
		System.out.println(p.getAdd().country);
		System.out.println(p.getAdd().pinCode);
		System.out.println();
		Address cAddress = new Address("2nd street", "Hyderabad", "AP", "India", 5676767);
		Address oAddress = new Address("3rd street", "Mumbai", "AP", "India", 8676767);
		Address pAddress = new Address("4th street", "Delhi", "AP", "India", 9676767);

		Employee e = new Employee(2, "Khan", "Sharukh", 56565656, 78787777, cAddress, oAddress, pAddress);

		System.out.println(e.id);
		System.out.println(e.fname);
		System.out.println(e.lname);
		System.out.println(e.pfno);
		System.out.println(e.ppfno);
		System.out.println();
		System.out.println(e.getCurrentAddress().street);
		System.out.println(e.getCurrentAddress().city);
		System.out.println(e.getCurrentAddress().state);
		System.out.println(e.getCurrentAddress().country);
		System.out.println(e.getCurrentAddress().pinCode);
		System.out.println();
		System.out.println(e.getOfficeAddress().street);
		System.out.println(e.getOfficeAddress().city);
		System.out.println(e.getOfficeAddress().state);
		System.out.println(e.getOfficeAddress().country);
		System.out.println(e.getOfficeAddress().pinCode);
		System.out.println();
		System.out.println(e.getPermanentAddress().street);
		System.out.println(e.getPermanentAddress().city);
		System.out.println(e.getPermanentAddress().state);
		System.out.println(e.getPermanentAddress().country);
		System.out.println(e.getPermanentAddress().pinCode);

	}
}
