package ExceptionHandling;

import java.util.Scanner;

public class TestRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.next();
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		System.out.println("Enter the city: ");
		String city = sc.next();
		System.out.println("Enter the userType: ");
		String userType = sc.next();
 
		Person p = new Person(name, age, city, userType);

		try {
			personData(p);
			System.out.println(p.toString());
		} catch (BusinessException ex) {
			System.out.println(ex.getMessage() + " " + ex.getErrorCode());
		}
	}

	public static void personData(Person p) throws BusinessException {

		if (p.getName().length() > 12) {
			BusinessException ex = new BusinessException("ERRO4", "name is invalid");
			throw ex;
		}
		if (p.getAge() <= 18 || p.getAge() >= 60) {
			BusinessException ex = new BusinessException("ERROR1", "age is invalid");
			throw ex;
		}
		if (!(p.getCity().equals("hyd") || p.getCity().equals("bangalore") || p.getCity().equals("chennai"))) {
			throw new BusinessException("ERRO2", "unsupported city");
		}

		if (!(p.getUserType().equals("agent") || p.getUserType().equals("admin"))) {
			throw new BusinessException("ERRO3", "invalid usertype");
		}
	}

}
