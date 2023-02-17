package Java8.Lambda;

public class TestService2 {

	public static void main(String[] args) {

		Service2 s = (name -> {
			System.out.println("My name is " + name);
		});
		
		s.process("Sai");

	}

}
