package Chap16.l_p812_AggregateExample;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
//		이것이 자바다 p812
		
		long countn = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(c -> c%2 == 0)
				.count();
		System.out.println("2의 배수 개수: " + countn);
//		count메소드는 long에서만 가능하데
		
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(s -> s%2 ==0)
				.sum();
		System.out.println("2의 배수의 합: " + sum);
//		sum은 long, int, double 다 된데
		
		double avg = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(a -> a%2 ==0)
				.average()
				.getAsDouble();
		System.out.println("2의 수의 평균: " + avg);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(a -> a%2 ==0)
				.max()
				.getAsInt();
		System.out.println("최대값: " + max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(a -> a%2 ==0)
				.min()
				.getAsInt();
		System.out.println("최대값: " + min);
		
		int firstThree = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(f -> f%3 ==0)
				.findFirst()
				.getAsInt();
		System.out.println("첫번째 3의 배수: " + firstThree);
		
	}

}
