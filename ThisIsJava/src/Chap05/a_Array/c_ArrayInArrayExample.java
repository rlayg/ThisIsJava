package Chap05.a_Array;

public class c_ArrayInArrayExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p. 162 �������迭 �������� �� ��
		
		int[][] scores = new int[2][3];
		scores[0][0] = 1;
		scores[0][1] = 2;
		scores[0][2] = 3;
		scores[1][0] = 4;
		scores[1][1] = 5;
		scores[1][2] = 6;
		
		for(int i = 0; i<2; i++) { //i<scores.length; �̰͵� ����
			for(int j = 0; j<3; j++) {//<scores[0].length;�̰͵�����
				System.out.println(scores[i][j]); 
			}
		}
		System.out.println("========");
		
		//or ����for�� p169 // p162 �������迭 �����Ϸ� ������ �ȳ���
		for(int[] array : scores) {
			for(int score : array) {
				System.out.println(score); // int[]�� int�� �ٲ���
				System.out.println(array); // �̰� �迭�ּ�
			}
		}
//		for(int array : scores) {
//			System.out.println(array); 
//		} �̰� �ȵ�
	}

}
