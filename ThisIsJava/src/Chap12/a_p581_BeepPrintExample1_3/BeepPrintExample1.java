package Chap12.a_p581_BeepPrintExample1_3;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		// 이것이 자바다 p 581 비프 발생 후 프린트
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // 비프음 발생
			} catch (Exception e) {}
				
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		

	}

}
