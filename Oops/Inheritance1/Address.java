package Oops.Inheritance1;

public class Address {

	String street;
	String city;
	String state;
	String country;
	int pincode;
	public Address(String street, String city, String state, String country, int pincode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public int getPincode() {
		return pincode;
	}
	
	
	
}
