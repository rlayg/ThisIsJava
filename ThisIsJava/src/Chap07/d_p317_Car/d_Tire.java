package Chap07.d_p317_Car;

public class d_Tire {
	//�ʵ�
	public int maxRotation; //�ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation; //���� ȸ����
	public String location; //Ÿ�̾��� ��ġ
	
	//������
	public d_Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation; //���� ȸ���� 1 ����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location +" Tire ����: " +
			(maxRotation-accumulatedRotation)+"ȸ");
		return true;
		}else {
			System.err.println("*** "+ location + " Tire ��ũ ***");
			return false;
		}
	}
}
