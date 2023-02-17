package Threads;

public class LambdaThread1 {

	public static void main(String[] args) {

		Runnable r = () -> {
			System.out.println("My Thread " + Thread.currentThread() + " Is Running");
		};

		Thread th = new Thread(r);	
		th.start();
		Thread th1 = new Thread(r);
		try {
			th1.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th1.start();
		
		//Currently 3 threads are Running
		//This will print 2nd because it is main... CPU will decide where to print data
		System.out.println("Byeee");
	}

}
