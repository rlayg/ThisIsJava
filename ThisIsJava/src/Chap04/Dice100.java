package Chap04;

public class Dice100 {
	public static void main(String[] args) {
		//�ֻ��� 1~100
		int dice100 = (int)(Math.random()*100) + 1;
		
		System.out.printf("%d ���ڰ� �������ϴ�\n", dice100);
		
		int dice6 = (int)(Math.random()*6) + 1;
		System.out.printf("%d ���ڰ� �������ϴ�", dice6);

	}

}
