package Chap06.b_class_p201;

public class b_CarExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.201
		//��ü ����
		ba_Car myCar = new ba_Car(); //������ �ҹ���
		//�ʵ尪 �Է�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
		
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
	}

}
