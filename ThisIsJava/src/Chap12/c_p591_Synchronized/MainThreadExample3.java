package Chap12.c_p591_Synchronized;

public class MainThreadExample3 {

	public static void main(String[] args) {
		// 이것이 자바다 p591
		Calculator3 calculator3 = new Calculator3();
		
		User3 user3 = new User3();
		user3.setCalculator(calculator3);
		user3.start();
		
		User4 user4 = new User4();
		user4.setCalculator(calculator3);
		user4.start();
	}

}
//수정된 Calculator3 동기화 이용된거 사용

