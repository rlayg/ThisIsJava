package Chap07.g_p336_Animal;

public abstract class g_Phone {//�߻� Ŭ����
	//�ʵ�
	public String owner;
	
	//������
	public g_Phone(String owner) {
		this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}

}
