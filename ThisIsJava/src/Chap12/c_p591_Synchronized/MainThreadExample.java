package Chap12.c_p591_Synchronized;

public class MainThreadExample {

	public static void main(String[] args) {
		// 이것이 자바다 p591
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}

}
// 두 스래드가 엉켜서 값이 이상해짐 유저1은 100 유저2는 50이야
