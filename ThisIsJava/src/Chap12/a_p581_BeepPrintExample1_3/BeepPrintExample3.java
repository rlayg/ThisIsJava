package Chap12.a_p581_BeepPrintExample1_3;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		//�̰��� �ڹٴ� p585
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}

	}

}
