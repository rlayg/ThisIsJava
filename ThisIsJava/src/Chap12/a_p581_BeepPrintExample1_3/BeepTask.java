package Chap12.a_p581_BeepPrintExample1_3;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // ������ �߻�
			} catch (Exception e) {}
		}
	}
}

	