package Threads;

public class MyThread3 extends Thread {
	
	public void run() {
		System.out.println("My Thread "+Thread.currentThread()+ " Is Running");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("My Thread "+Thread.currentThread()+ " Is Running");
	}

}
