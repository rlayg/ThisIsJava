package Chap12.b_p602_SleepYieldJoinExample;

public class Yield {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p604
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		// ������ a b ��� ����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		threadA.work = false;
		//������ b�� ����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		threadA.work = true;
		//������ a b ��� ����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		threadA.stop = true;
		threadB.stop = true;
		// ������  a b ��� ����
	}

}
