package Chap12.e_p618_DaemonExample;

public class DaemonExample {

	public static void main(String[] args) {
		// 이것이 자바다 p619
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); //AutoSaveThread를 데몬 스래드로 만듦
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 스래드 종료");

	}

}
