package InnerClasses;

public class TestMember {

	public static void main(String[] args) {

		Outer outerObj = new Outer();

		Outer.Inner innerObj = outerObj.new Inner();

		innerObj.msg();
	}

}
