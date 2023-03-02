package Chap16.j_sec5_p800;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		// 이것이 자바다 p809
		int[] intArr = {1, 2, 3, 4, 5};
		
		System.out.println("[peek()을 마지막에 호출한 경우");
		
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(n -> System.out.println(n)); // 동작하지 않는다 // 왜? 최종처리가 없어서
		
		System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
		
		int total = Arrays.stream(intArr)
				.filter(a -> a%2 == 0)
				.peek(n -> System.out.println(n))
				.sum();
		System.out.println("총합: " + total);
		
		System.out.println("[forEach를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.forEach(n -> System.out.println(n));

	}

}
