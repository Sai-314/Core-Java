package Annotations;

public class TestField2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub

		int save = ReadAnnotation.getDeclaredSize("Annotations.Person", "name");
		System.out.println(save);

		validate("Sai", save);

	}

	public static void validate(String value, int size) {

		if (value.length() < size) {
			System.out.println("valid name");
		} else {
			System.out.println("not valid name");
		}
	}

}
