package Serilization1;

import java.io.Serializable;

public class Me implements Serializable {

	private static final long serialVersionUID = 1310112534L;
	String name;
	String gender;
	int age;
	//Static variables are not part of object.
	// we need to declare static values in this class only because it wont take
	// static values in the constructor
	//Here value will be modified, even we have set after serialization.
	static String maritalStatus = "Single but ...";

	//static String maritalStatus;
	String favColor;
	//Sometimes, we do not want serialize some data members.
	//Transient data members are not be serialized.
	//When, we deserialize objects, the transient variable(s) will have default values.
	transient String favJob;
	String favHobbie;

	public Me(String name, String gender, int age, String maritalStatus, String favColor, String favJob, String favHobbie) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.maritalStatus = maritalStatus;
		//maritalStatus = this.maritalStatus;
		this.favColor = favColor;
		this.favJob = favJob;
		this.favHobbie = favHobbie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getFavColor() {
		return favColor;
	}

	public void setFavColor(String favColor) {
		this.favColor = favColor;
	}

	public String getFavJob() {
		return favJob;
	}

	public void setFavJob(String favJob) {
		this.favJob = favJob;
	}

	public String getFavHobbie() {
		return favHobbie;
	}

	public void setFavHobbie(String favHobbie) {
		this.favHobbie = favHobbie;
	}

	@Override
	public String toString() {
		return "Me [name=" + name + ", gender=" + gender + ", age=" + age + ", maritalStatus=" + maritalStatus
				+ ", favColor=" + favColor + ", favJob=" + favJob + ", favHobbie=" + favHobbie + "]";
	}

}
