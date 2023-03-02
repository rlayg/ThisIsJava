package Chap10.h_p444_BalanceInsufficienRxception;

public class AccountExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p447
		Account account = new Account();
//		�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: "+ account.getBalance());
//		����ϱ�
		try {
			account.withdraw(100);
		}catch(BalanceInsufficienRxception e) {
			String message = e.getMessage();
//			���� �޼��� ���
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
//			���� ���� �� ���
		}
		System.out.println("���ݾ�: "+ account.getBalance());
	}
}

