package Chap12.a_p581_BeepPrintExample1_3;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p582
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}

	}

}
