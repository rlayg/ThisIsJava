package Chap05.a_Array;

public class a_ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.152
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		//�迭 �� �����ϱ� - �� �� scores[0] = 110; �̷��� �ֱ�
		int sum = 0;
		for(int i =0; i<scores.length; i++) {
			sum+= scores[i];
		}
		System.out.println("���� : " + sum);
		double avg = (double)sum/3;
		System.out.println("��� : " + avg);
	}

}
