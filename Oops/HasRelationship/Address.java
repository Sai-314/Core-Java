package Oops.HasRelationship;

public class Address {
	
	String street;
	String city;
	String state;
	String country;
	int pinCode;
	public Address(String street, String city, String state, String country, int pinCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
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

	public int getPinCode() {
		return pinCode;
	}

	

	
}
