package Chap12.d_p614_StopInterrupt;

public class InterruptExample {

	public static void main(String[] args) {
		// �̰����ڹٴ� p616
		Thread thread = new PrintThread2();
//		Thread thread = new PrintThread22();
		
		thread.start();
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		thread.interrupt();

	}

}
