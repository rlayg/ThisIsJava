package Chap12.c_p591_Synchronized;

public class MainThreadExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p591
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}

}
// �� �����尡 ���Ѽ� ���� �̻����� ����1�� 100 ����2�� 50�̾�
