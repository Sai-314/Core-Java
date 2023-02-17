package Threads;

public class LambdaThread {

	public static void main(String[] args) {
	
		Runnable r = ()->{System.out.println("Thread "+Thread.currentThread()+ " Is Running");};

		Thread th = new Thread(r);
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th.start();
		th1.start();
		th2.start();
	}

}
