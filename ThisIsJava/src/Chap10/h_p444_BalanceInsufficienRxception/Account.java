package Chap10.h_p444_BalanceInsufficienRxception;

public class Account {
// ����� ���� ���� �߻���Ű��
	public long balance;
	public Account() {} //������
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficienRxception{
//		����� ���� ���� ���ѱ��
		if(balance<money) {
			throw new BalanceInsufficienRxception("�ܰ����: "+(money-balance)+"���ڶ�");
		}
//		����� ���� ���� �߻�
		balance -=money;
		
	}
}
