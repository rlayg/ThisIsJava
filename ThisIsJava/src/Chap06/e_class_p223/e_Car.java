package Chap06.e_class_p223;

public class e_Car {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false; //false�� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true; //true�� ����
	}
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ�: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�. (gas�ܷ�: " + gas +")");
				return;
			}
		}
	}

}
