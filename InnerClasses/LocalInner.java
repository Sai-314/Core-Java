package InnerClasses;

public class LocalInner {

	public void display() {

		class Local {
			void msg() {
				System.out.println("This is class inside the method");
			}
		}
		Local inner = new Local();
		inner.msg();
	}

}
