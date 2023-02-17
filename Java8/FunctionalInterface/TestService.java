package Java8.FunctionalInterface;

public class TestService {

	public static void main(String[] args) {
		Service s = new Service() {

			@Override
			public String show(String str) {
				System.out.println(str);
				return str;
			}
		};
		s.show("Hello World");
		s.show("From Sai");

	}

}
