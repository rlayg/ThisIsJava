package Chap12.e_p618_DaemonExample;

public class DaemonExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p619
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); //AutoSaveThread�� ���� ������� ����
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("���� ������ ����");

	}

}
