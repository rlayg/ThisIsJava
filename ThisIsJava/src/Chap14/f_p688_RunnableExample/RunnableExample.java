package Chap14.f_p688_RunnableExample;

public class RunnableExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p688
		Runnable runnable = () ->{
			for(int i = 0; i<10; i++) {
				System.out.println(i);
			}
		};
		//���ٽ�(�����尡 �����ϴ� �ڵ�)
		
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
