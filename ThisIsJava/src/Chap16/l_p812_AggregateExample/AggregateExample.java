package Chap16.l_p812_AggregateExample;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
//		�̰��� �ڹٴ� p812
		
		long countn = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(c -> c%2 == 0)
				.count();
		System.out.println("2�� ��� ����: " + countn);
//		count�޼ҵ�� long������ �����ϵ�
		
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(s -> s%2 ==0)
				.sum();
		System.out.println("2�� ����� ��: " + sum);
//		sum�� long, int, double �� �ȵ�
		
		double avg = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(a -> a%2 ==0)
				.average()
				.getAsDouble();
		System.out.println("2�� ���� ���: " + avg);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(a -> a%2 ==0)
				.max()
				.getAsInt();
		System.out.println("�ִ밪: " + max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(a -> a%2 ==0)
				.min()
				.getAsInt();
		System.out.println("�ִ밪: " + min);
		
		int firstThree = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(f -> f%3 ==0)
				.findFirst()
				.getAsInt();
		System.out.println("ù��° 3�� ���: " + firstThree);
		
	}

}
