package Chap04;

public class IfDiceExample {
	public static void main(String[] args) {
		//�̰��� �ڹٴ� p.114
		int num = (int)(Math.random()*6) + 1;
		
		if(num == 6) {
			System.out.println("�ֻ��� ���ڴ� 6�Դϴ�");
		} else if(num == 5) {
			System.out.println("�ֻ��� ���ڴ� 5�Դϴ�");
		} else if(num == 4) {
			System.out.println("�ֻ��� ���ڴ� 4�Դϴ�");
		} else if(num == 3) {
			System.out.println("�ֻ��� ���ڴ� 3�Դϴ�");
		} else if(num == 2) {
			System.out.println("�ֻ��� ���ڴ� 2�Դϴ�");
//		} else if(num == 1) {
//			System.out.println("�ֻ��� ���ڴ� 1�Դϴ�");
//			�̷��� �ص� ������ �ؿ��� ����
		}else {
			System.out.println("�ֻ��� ���ڴ� 1�Դϴ�");
		}
		
			// �� ��ų������ �ֻ��� ���ڰ� �ٸ��� ���´�
	}

}
