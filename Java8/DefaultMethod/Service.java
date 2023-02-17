package Java8.DefaultMethod;


public interface Service {
	
	void show();
	
	default void display() {
		System.out.println("This is display method");
	}
	static void view() {
		System.out.println("This is static method");
	}

}
