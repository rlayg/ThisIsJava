package Chap05.a_Array;

public class c_ArrayInArrayExample {

	public static void main(String[] args) {
		// 이것이 자바다 p. 162 다차원배열 선생님이 쓴 예
		
		int[][] scores = new int[2][3];
		scores[0][0] = 1;
		scores[0][1] = 2;
		scores[0][2] = 3;
		scores[1][0] = 4;
		scores[1][1] = 5;
		scores[1][2] = 6;
		
		for(int i = 0; i<2; i++) { //i<scores.length; 이것도 가능
			for(int j = 0; j<3; j++) {//<scores[0].length;이것도가능
				System.out.println(scores[i][j]); 
			}
		}
		System.out.println("========");
		
		//or 향상된for문 p169 // p162 다차원배열 이해하래 진도는 안나감
		for(int[] array : scores) {
			for(int score : array) {
				System.out.println(score); // int[]를 int로 바꿔줌
				System.out.println(array); // 이건 배열주소
			}
		}
//		for(int array : scores) {
//			System.out.println(array); 
//		} 이건 안돼
	}

}
