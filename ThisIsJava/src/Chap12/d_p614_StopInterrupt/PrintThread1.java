package Chap12.d_p614_StopInterrupt;

public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void run() {
		while(!stop) {
			System.out.println("������");
		}
		System.out.println("�ڿ� ����"); // stop�� true�� �� ��
		System.out.println("���� ����");
	}
}
