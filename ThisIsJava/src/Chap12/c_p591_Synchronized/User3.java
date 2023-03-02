package Chap12.c_p591_Synchronized;

public class User3 extends Thread {
	// p 592
	private Calculator3 calculator3;
	
	public void setCalculator(Calculator3 calculator3) {
		this.setName("User3");
		this.calculator3 = calculator3;
	}
	
	public void run() {
		calculator3.setMemory(100);
	}

}
