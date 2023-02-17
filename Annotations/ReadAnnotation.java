package Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReadAnnotation {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub

		System.out.println("Person.id : " + ReadAnnotation.getDeclaredSize("Annotations.Person", "id"));

	}

	public static int getDeclaredSize(String className, String FieldName)
			throws ClassNotFoundException, NoSuchFieldException, SecurityException {

		Class c = Class.forName("Annotations.Person");

		Field fileds = c.getDeclaredField(FieldName);

		Annotation[] annotation = fileds.getAnnotations();

		int size = -1;

		for (Annotation ann : annotation) {
			if (ann instanceof Size) {
				Size myAnnotation = (Size) ann;
				size = myAnnotation.value();
			}
		}

		return size;

	}

}
