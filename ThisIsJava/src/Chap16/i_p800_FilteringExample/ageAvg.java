package Chap16.i_p800_FilteringExample;

import java.util.Arrays;
import java.util.List;

public class ageAvg {

	public static void main(String[] args) {
		// 이것이 자바다 p800
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		names.stream()
		.distinct()
		.forEach(s -> System.out.println(s));
		
		System.out.printf("\n");
		
		names.stream()
		.filter(s -> s.startsWith("신"))
		.forEach(a -> System.out.println(a));
		
		System.out.printf("\n");
		
		names.stream()
		.distinct()
		.filter(s -> s.startsWith("신"))
		.forEach(s -> System.out.println(s));
	}

}
