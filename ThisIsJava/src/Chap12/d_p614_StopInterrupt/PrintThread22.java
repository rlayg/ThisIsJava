package Chap12.d_p614_StopInterrupt;

public class PrintThread22 extends Thread {
	//PrintThread2�� ������ �� Thread.sleep(1);�� ���� �ʰ� Thread.interrupted�� ���
	//InterruptExample �� ���
	
	public void run() {
	
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {
				break; // while���� ��������
			}
		}

		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
