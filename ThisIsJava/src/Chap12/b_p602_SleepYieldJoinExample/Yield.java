package Chap12.b_p602_SleepYieldJoinExample;

public class Yield {

	public static void main(String[] args) {
		// 이것이 자바다 p604
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		// 스래스 a b 모두 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		threadA.work = false;
		//스래스 b만 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		threadA.work = true;
		//스래드 a b 모두 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		threadA.stop = true;
		threadB.stop = true;
		// 스래드  a b 모두 종료
	}

}
