package Chap07.a_p291_DmCellPhone;

public class aa_DmCellPhone extends ab_CellPhone{
	//�ʵ�
	int channel;
	
	//������
	aa_DmCellPhone(String model, String color, int channel){
		this.model = model;// �θ�Ŭ����
		this.color = color;// �θ�Ŭ����
		this.channel = channel;
	}
	//�޼ҵ�
	 void turnOnDmb() {
		 System.out.println("ä�� "+channel + "�� DMB ��� ������ �����մϴ�");
	 }
	 void changeChannelDmb(int channel) {
		 this.channel = channel;
		 System.out.println("ä�� "+ channel + "������ �ٲߴϴ�");
	 }
	 void turnOffDmb() {
		 System.out.println("DMB ��� ������ ����ϴ�");
		 
	 }
}


