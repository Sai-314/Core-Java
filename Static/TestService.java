package Static;

public class TestService {
	
	public static void main(String[] args) {
		
		Service s = new Service();
		
		s.m1();
		s.m2();
		Service.m3();
		Service.m4();
	}

}
