package Assignments;

import java.util.Scanner;

public class Product {

	Scanner sc = new Scanner(System.in);

	String productName;
	String productcolor;
	int productSize;
	String productDiscount;
	int productPrice;

	public void productName() {
		productName = sc.next();
	}

	public void productcolor() {
		productcolor = sc.next();
	}

	public void productSize() {
		productSize = sc.nextInt();
	}

	public void productDiscount() {
		System.out.println("product discount is 20%");
	}

	public void productPrice() {
		productPrice = sc.nextInt();
	}

	//Here we can access the methods inside the methods by using this.methodName(); method.
	public void finalPrice() {
		System.out.print("Enter the product name: ");
		this.productName();
		System.out.print("Enter the product color: ");
		this.productcolor();
		System.out.print("Enter the product size: ");
		this.productSize();
		this.productDiscount();
		System.out.print("Enter the product price: ");
		this.productPrice();
		float discount = 0.2f;
		float finalPrice = productPrice - (productPrice * discount);
		System.out.println("Final price for the " + productName + " is :" + finalPrice);
	}

}
