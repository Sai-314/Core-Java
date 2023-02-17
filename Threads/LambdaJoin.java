package Threads;

public class LambdaJoin {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = () -> {
			System.out.println("My Thread " + Thread.currentThread() + " Is Running");
		};

		Thread th = new Thread(r);	
		th.start();
		System.out.println(th.isAlive());
		Thread th1 = new Thread(r);
		try {
			th1.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		th1.start();	
		//By using join method we are deciding where to join the data
		th1.join();
		
		System.out.println("Byeee");		
		System.out.println(th1.isAlive());

	}

}
