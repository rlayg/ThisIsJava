package Chap11.e_p500_StringCharAtExample;

public class StringCharAtExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p500
//		String ssn = "010624-1230123";
//		char sex = ssn.charAt(7);
//		
//		switch(sex) {
//		case '1':
//		case '3':
//			System.out.println("���� �Դϴ�");
//			break;
//		case '2':
//		case '4':
//			System.out.println("���� �Դϴ�");
//			break;
		
//		p501
		String str1 = new String("�Ź�ö");
		String str2 = "�Ź�ö";
		
		if(str1 == str2) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		if(str1.equals(str2)) {
			System.out.println("���� ���ڿ��� ����");
		} else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
		
	}

}
