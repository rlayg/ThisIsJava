package Chap12.a_p581_BeepPrintExample1_3;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// 이것이 자바다 p582
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}

	}

}
