package Chap14.f_p688_RunnableExample;

public class RunnableExample {

	public static void main(String[] args) {
		// 이것이 자바다 p688
		Runnable runnable = () ->{
			for(int i = 0; i<10; i++) {
				System.out.println(i);
			}
		};
		//람다식(스레드가 실행하는 코드)
		
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
