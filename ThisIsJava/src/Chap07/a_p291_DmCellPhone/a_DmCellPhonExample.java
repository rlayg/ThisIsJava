package Chap07.a_p291_DmCellPhone;

public class a_DmCellPhonExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.291
		//aa_DmCellPhone ��ü ����
		aa_DmCellPhone dmbCellPhone = new aa_DmCellPhone("�ڹ���", "����", 10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��"+ dmbCellPhone.model);
		System.out.println("����"+ dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��" + dmbCellPhone.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("�� �� �ݰ����ϴ�");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
