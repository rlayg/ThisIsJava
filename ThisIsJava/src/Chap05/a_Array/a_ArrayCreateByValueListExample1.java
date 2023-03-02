package Chap05.a_Array;

public class a_ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// 이것이 자바다 p.152
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		//배열 값 수정하기 - 콕 찝어서 scores[0] = 110; 이렇게 넣기
		int sum = 0;
		for(int i =0; i<scores.length; i++) {
			sum+= scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double)sum/3;
		System.out.println("평균 : " + avg);
	}

}
