package Annotations;

public class User {

	@Size(value = 10)
	int pan;

	public User(int pan) {
		super();
		this.pan = pan;
	}

	public int getPan() {
		return pan;
	}

	public void setPan(int pan) {
		this.pan = pan;
	}

}
