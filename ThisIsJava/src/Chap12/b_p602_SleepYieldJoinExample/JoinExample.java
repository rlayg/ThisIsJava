package Chap12.b_p602_SleepYieldJoinExample;

public class JoinExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p607
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {}
		// sumThread�� ����� ������ ���� �����尡 ��ٸ�
		
		System.out.println("1~100 ��: " + sumThread.getSum());

	}

}
