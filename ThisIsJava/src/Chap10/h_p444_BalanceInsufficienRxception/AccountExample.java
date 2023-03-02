package Chap10.h_p444_BalanceInsufficienRxception;

public class AccountExample {

	public static void main(String[] args) {
		// 이것이 자바다 p447
		Account account = new Account();
//		예금하기
		account.deposit(10000);
		System.out.println("예금액: "+ account.getBalance());
//		출금하기
		try {
			account.withdraw(100);
		}catch(BalanceInsufficienRxception e) {
			String message = e.getMessage();
//			예외 메세지 얻기
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
//			예외 추적 후 출력
		}
		System.out.println("예금액: "+ account.getBalance());
	}
}

