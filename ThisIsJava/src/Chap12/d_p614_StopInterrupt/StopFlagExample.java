package Chap12.d_p614_StopInterrupt;

public class StopFlagExample {

	public static void main(String[] args) {
		// �̰����ڹٴ� p614
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		printThread.setStop(true);

	}

}
