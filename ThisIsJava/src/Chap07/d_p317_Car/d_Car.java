package Chap07.d_p317_Car;

public class d_Car {
	//�ʵ� // �ڵ����� 4���� Ÿ�̾ ������
	d_Tire frontLeftTire = new d_Tire("�տ���", 6);
	d_Tire frontRightTire = new d_Tire("�տ�����", 2);
	d_Tire backLeftTire = new d_Tire("�ڿ���", 3);
	d_Tire backRightTire = new d_Tire("�ڿ�����", 4);
	
	//������
	
	//�޼ҵ�
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) { stop(); return 1;}
		if(frontRightTire.roll()==false) { stop(); return 2;}
		if(backLeftTire.roll()==false) { stop(); return 3;}
		if(backRightTire.roll()==false) { stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]"); // ��ũ������ ����
	}

}
