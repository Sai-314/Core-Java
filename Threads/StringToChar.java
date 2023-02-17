package Threads;

public class StringToChar {

	public static void main(String[] args) {

		String str = "Java Is A Programming Language";

		Runnable r = () -> {
			for (char ch : str.toCharArray()) {
				System.out.print(ch);
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread th = new Thread(r);
		th.start();
	}

}
