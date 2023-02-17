package Basic;

abstract class Abstraction {
	abstract void kid();
}

abstract class parent extends Abstraction {
	void kid() {
		System.out.println("Hey kid");
	}

	abstract void children();
}

class children1 extends parent {
	void children() {
		System.out.println("Hey child");
	}
}
