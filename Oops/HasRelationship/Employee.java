package Oops.HasRelationship;

public class Employee {
	
	int id;
	String fname;
	String lname;
	int pfno;
	int ppfno;
	Address currentAddress;
	Address officeAddress;
	Address permanentAddress;
	public Employee(int id, String fname, String lname, int pfno, int ppfno, Address currentAddress,
			Address officeAddress, Address permanentAddress) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.pfno = pfno;
		this.ppfno = ppfno;
		this.currentAddress = currentAddress;
		this.officeAddress = officeAddress;
		this.permanentAddress = permanentAddress;
	}
	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getPfno() {
		return pfno;
	}

	public int getPpfno() {
		return ppfno;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public void setFname(String fname) {
//		this.fname = fname;
//	}
//	public void setLname(String lname) {
//		this.lname = lname;
//	}
//	public void setPfno(int pfno) {
//		this.pfno = pfno;
//	}
//	public void setPpfno(int ppfno) {
//		this.ppfno = ppfno;
//	}
//	public void setCurrentAddress(Address currentAddress) {
//		this.currentAddress = currentAddress;
//	}
//	public void setOfficeAddress(Address officeAddress) {
//		this.officeAddress = officeAddress;
//	}
//	public void setPermanentAddress(Address permanentAddress) {
//		this.permanentAddress = permanentAddress;
//	}

	
	
	
}
