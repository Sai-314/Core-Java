package Java8.DefaultMethod;

public class TestService {
	public static void main(String[] args) {
		Service s = new Service() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("This is abstract method");

			}
		};
		s.show();
		s.display();
		Service.view();
	}

}
