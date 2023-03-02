package Chap12.c_p591_Synchronized;

public class User1 extends Thread {
	// p 592
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}

}
