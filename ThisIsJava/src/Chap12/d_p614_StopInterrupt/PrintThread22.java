package Chap12.d_p614_StopInterrupt;

public class PrintThread22 extends Thread {
	//PrintThread2를 수정한 것 Thread.sleep(1);를 쓰지 않고 Thread.interrupted를 사용
	//InterruptExample 에 사용
	
	public void run() {
	
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break; // while문을 빠져나옴
			}
		}

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
