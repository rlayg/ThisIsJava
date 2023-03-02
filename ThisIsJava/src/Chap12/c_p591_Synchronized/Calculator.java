package Chap12.c_p591_Synchronized;

public class Calculator {
	//p 592
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName()+": "+this.memory); // 스래드이름, 메모리 값
	}
}
