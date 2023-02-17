package InnerClasses;

public class TestStatic {

	public static void main(String[] args) {

		StaticOuter.Inner nestedObj = new StaticOuter.Inner();
		nestedObj.name();
	}

}
