package Chap01;

public class StringEqualExamole {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.91
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");
		
		System.out.println( strVar1 == strVar2); // ���� ��ü���� �Ź�ö
		System.out.println( strVar1 == strVar3); // �ٸ� ��ü���� �Ź�ö
		System.out.println();
		System.out.println( strVar1.equals(strVar2));// ���ڸ� �������� Ȯ�� equals
		System.out.println( strVar1.equals(strVar3));// ����

	}

}
