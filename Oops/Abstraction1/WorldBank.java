package Oops.Abstraction1;

public abstract class WorldBank {

	int a;
	int b;
	int c;

	public WorldBank(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public abstract void createAccount();

	public abstract void getKYC();

}
