package Chap12.a_p581_BeepPrintExample1_3;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p 581 ���� �߻� �� ����Ʈ
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit ��ü ���
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // ������ �߻�
			} catch (Exception e) {}
				
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		

	}

}
