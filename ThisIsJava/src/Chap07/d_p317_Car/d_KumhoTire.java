package Chap07.d_p317_Car;

public class d_KumhoTire extends d_Tire{
	// �ʵ�
		// ������
		public d_KumhoTire(String location, int maxRotation) {
			super(location, maxRotation);
		}
		//�޼ҵ�
		@Override
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation<maxRotation) {
				System.out.println(location + " KumhoTire ����: " +
						(maxRotation-accumulatedRotation) + "ȸ");
			return true;
			}else {
				System.out.println("*** "+ location+ " KumhoTire ��ũ ***");
			return false;
			}
		}


}
