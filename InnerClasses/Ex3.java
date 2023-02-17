package InnerClasses;

public class Ex3 {

	public static void main(String[] args) {

		int a = getData(10000);
		String b = getData("Iphone");
		float c = getData(567.78f);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	//Here we are returning any kind of datatype
	public static <T> T getData(T data) {

		return data;

	}

}
