package Chap07.d_p317_Car;

public class d_CarExample {
	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.317
		d_Car car = new d_Car();
		
		for(int i = 1; i<5; i++) {
			int problemLocation = car.run();
			//car��ü�� run()�޼ҵ� 5�� �ݺ� ����
			
			switch(problemLocation) { // Ÿ�̾� �յڿ��� ��ũ���� �� ��ü
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire = new d_HankookTire("�տ���",15);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new d_HankookTire("�տ�����",13);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.backLeftTire = new d_HankookTire("�ڿ���",14);
				break;
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.backRightTire = new d_HankookTire("�ڿ�����",17);
				break;
			}
			System.out.println("------------------");
			//1ȸ�� �� ��µǴ� ������ ����
			
		}
	}

}
