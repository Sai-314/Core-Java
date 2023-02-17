package JavaPractice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReadAnnotation {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		
		System.out.println("Person.name :"+ ReadAnnotation.getDeclaredSize("JavaPractice.Person","name"));
	}

	private static String getDeclaredSize(String className, String FieldName) throws ClassNotFoundException, NoSuchFieldException, SecurityException {

		Class c = Class.forName("JavaPractice.Person");
		
		Field field = c.getDeclaredField(FieldName);
		Annotation[] annotations = field.getAnnotations();
		
		String size = null;
		
		for(Annotation ann : annotations) {
			if(ann instanceof Size) {
				Size myannotation = (Size) ann;
				size = myannotation.value1();
			}
		}	
		return size;
	}

}
