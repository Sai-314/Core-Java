package Threads;

public class AnnonymousThread {
	
	public static void main(String[] args) {
		
		Runnable r =  new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello this is Sai");
			}
		};
		Thread th = new Thread(r);
		th.start();
	}

}
