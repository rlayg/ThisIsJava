package Chap12.c_p591_Synchronized;

public class User4 extends Thread {
	// p 592
	private Calculator3 calculator3;
	
	public void setCalculator(Calculator3 calculator3) {
		this.setName("User4");
		this.calculator3 = calculator3;
	}
	
	public void run() {
		calculator3.setMemory(50);
	}

}
