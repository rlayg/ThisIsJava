package Chap12.c_p591_Synchronized;

public class Calculator3 {
	//p 592
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) { // 여기 synchronized 넣음
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory); // 스래드이름, 메모리 값
	}
}

//수정된 Calculator 동기화 이용된거 사용
