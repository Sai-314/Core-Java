package Java8.Lambda;

public class TestService {

	public static void main(String[] args) {

		Service s1 = () -> {
			System.out.println("This");
		};
		Service s2 = () -> {
			System.out.println("is");
		};
		Service s3 = () -> {
			System.out.println("Bunny");
		};

		s1.process();
		s2.process();
		s3.process();
	}

}
