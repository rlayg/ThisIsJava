package Chap06.e_class_p223;

public class e_CarExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.223
		e_Car myCar = new e_Car();
		myCar.setGas(5); //Car�� setGas() �޼ҵ� ȣ��		
		boolean gasState = myCar.isLeftGas(); 
		/*
		 	gasState�� myCar.isLeftGas()�޼ҵ��� ������ �����ϰ� ��ȯ���� ����
		 	�׷��� if(gasState)�� if(myCar.isLeftGas()) �� �ְ� �Ǹ�, �������� �ѹ� ����Ǿ��µ�,
			�̰� ���ǹ� �ȿ����� myCar.isLeftGas() �� �޼ҵ尡 �ѹ��� ����ǹǷ�, gas�� �ֽ��ϴ� �� �ѹ��� ����� �˴ϴ�.
			��, ���� �޼ҵ尡 �ι� ȣ��ǹǷ�, �ι� ����� �̷�� ���ϴ�.
		*/
		if(gasState) {
//			�� �ڸ��� myCar.isLeftGas() ������ 'gas�� �ֽ��ϴ�'�� �ι� ����
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) { 
//			myCar.isLeftGas() �� �ڸ��� gasState ������ ���� ���Ԥ��������
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("������ �����ϼ���.");
		}
//  
	}

}

//boolean gasState = myCar.isLeftGas();
//ó�� ���⿡ ������ ���� �뷮�� gasState�� ������ �˴ϴ�.
//�׸��� ���Ŀ� run()�޼ҵ带 �����ϸ鼭 gas�� ������ �˴ϴ�.
//�׷��� �� ������ ������� gas�� ���� �����ϴ� ������ gasState���� ������ �����ϴ�.
//��������
//if (myCar.isLeftGas()) {
//�� �ƴ϶�
//if (gasState) {
//�� �������ϰ� �Ǹ� gasState�� ó������ �״�� ������ �ֱ� ������ ������ ���ٰ� ������ �ʰ�,
//������ ������ �ʿ䰡 ���ٰ� ������ ��������^^
