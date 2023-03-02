package Chap12.d_p614_StopInterrupt;

public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void run() {
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원 정리"); // stop이 true가 될 떄
		System.out.println("실행 종료");
	}
}
