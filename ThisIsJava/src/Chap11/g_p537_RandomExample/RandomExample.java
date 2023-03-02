package Chap11.g_p537_RandomExample;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.537 로또뽑기
		
		//선택번호
		int[] selecNumber = new int[6];  // 선택번호 6개 저장될 배열 생성
		Random random = new Random(3);  // 선택번호 얻기 위한 랜덤 객체 생성 3은 난수 지정
		System.out.println("선택 번호: ");
		for(int i = 0; i<6; i++) {
			selecNumber[i] = random.nextInt(45) +1; // 선택 번호 얻어 배열에 저장 nextint는 0부터 지정한 숫자-1까지 얻기
			System.out.print(selecNumber[i] + " ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(1231); // 당첨번호를 얻기 위한 랜덤객체 생성  난수 삽입
		System.out.println("당첨 번호: ");
		for(int i = 0; i<6; i++) {
			winningNumber[i] = random.nextInt(45)+1 ;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println("");
		
		//당첨여부
		Arrays.sort(selecNumber);
		Arrays.sort(winningNumber); // 선택넘버와 당첨넘버 비교하기전에 정렬 sort가 정렬
		boolean result = Arrays.equals(selecNumber, winningNumber);  // 배열 항목 값을 비교
		System.out.print("당첨 여부 ");
		if(result) {
			System.out.println("1등");
		}else {
			System.out.println("꽝");
		}
		
		
	}

}
