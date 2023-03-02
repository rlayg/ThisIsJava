package Chap12.b_p602_SleepYieldJoinExample;

public class JoinExample {

	public static void main(String[] args) {
		// 이것이 자바다 p607
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {}
		// sumThread가 종료될 때까지 메인 스래드가 기다림
		
		System.out.println("1~100 합: " + sumThread.getSum());

	}

}
