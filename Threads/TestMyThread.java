package Threads;

public class TestMyThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread mt = new MyThread();
		MyThread mt1 = new MyThread();
	
		
		//System.out.println(mt.getName());
		//System.out.println(mt.getPriority());
		
		//mt.setName("Helloo");
		//mt.setPriority(10);
		
		//System.out.println(mt.getName());
		//System.out.println(mt.getPriority());
		
		
		mt.start();
		mt.sleep(10000);
		mt1.start();
	}

}
