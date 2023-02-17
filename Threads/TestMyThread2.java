package Threads;

public class TestMyThread2 {

	public static void main(String[] args) {

		Thread th = new Thread(new MyThread2());
		
		th.start();
	}

}
