package Chap10.h_p444_BalanceInsufficienRxception;

public class Account {
// 사용자 정의 예외 발생시키기
	public long balance;
	public Account() {} //생성자
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficienRxception{
//		사용자 정의 예외 떠넘기기
		if(balance<money) {
			throw new BalanceInsufficienRxception("잔고부족: "+(money-balance)+"모자람");
		}
//		사용자 정의 예외 발생
		balance -=money;
		
	}
}
