package Chap04;
//�̰��� �ڹٴ� 4�� Ȯ�ι��� 4��
public class practice {
	public static void main(String[] args) {
		while(true) {	
			int dice1 = (int) (Math.random()*6)+1;
			int dice2 = (int) (Math.random()*6)+1;
			System.out.printf("(%d, %d)\n", dice1, dice2);
			if(dice1 == 1) {
				if(dice2 ==4) {
				break;
				}
			}
			if(dice1 == 4) {
				if(dice2 == 1) {
				break;
				}
			}
			if(dice1 == 2) {
				if(dice2 == 3) {
				break;
				}
			}
			if(dice1 == 3) {
				if(dice2 == 2) {
				break;
				}
			}
		}//����Ǭ��
		//����
//		int num1 = 0;
//		int num2 = 0;
//		
//		while(num1 + num2 != 5) {
//			num1 = (int)(Math.random()*6)+1;
//			num2 = (int)(Math.random()*6)+1;
//					
//			System.out.printf("%d, %d\n", num1, num2);
//		}
			
	}	
}
