package Chap12.b_p602_SleepYieldJoinExample;

public class ThreadB extends Thread {
	public boolean stop = false; // ���� �÷���
	public boolean work = true; // �۾� ���� ���� �÷���
	
	public void run() {
		while(!stop) { //stop�� true �� �Ǹ� while�� ����
			if(work) {System.out.println("ThreadB �۾� ����");
		} else {
			Thread.yield();
		}
	}
		System.out.println("ThreadB ����");
	}

}
