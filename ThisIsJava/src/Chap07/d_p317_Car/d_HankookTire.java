package Chap07.d_p317_Car;

public class d_HankookTire extends d_Tire {
	// �ʵ�
	// ������
	public d_HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire ����: " +
					(maxRotation-accumulatedRotation) + "ȸ");
		return true;
		}else {
			System.out.println("*** "+ location+ " HankookTire ��ũ ***");
		return false;
		}
	}

}
