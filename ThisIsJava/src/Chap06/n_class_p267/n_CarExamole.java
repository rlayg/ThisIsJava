package Chap06.n_class_p267;

public class n_CarExamole {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.267
		na_Car myCar = new na_Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("����ӵ�: " + myCar.getSpeed());
		
		//�ǹٸ� �ӵ�����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("����ӵ�: " + myCar.getSpeed());

	}

}
