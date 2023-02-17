package InnerClasses;

public class StaticOuter {

	static String name = "Pavan";
	int count = 30;

	static class Inner {
		void name() {
			System.out.println("Accessing name by outer static class " + name);
		}
	}
}
