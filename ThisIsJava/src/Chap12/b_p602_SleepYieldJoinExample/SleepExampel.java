package Chap12.b_p602_SleepYieldJoinExample;

import java.awt.Toolkit;

public class SleepExampel {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� pp602
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
		}

	}

}
