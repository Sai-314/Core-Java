package Annotations;

public class TestField {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {

		int save = ReadAnnotation.getDeclaredSize("Annotations.Person","name");
		System.out.println(save);

	}

}
