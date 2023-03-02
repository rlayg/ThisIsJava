package Chap16.g_p792_FromIntRangeExample;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;
		
	public static void main(String[] args) {
		// 이것이 자바다 p792
		IntStream intstream = IntStream.rangeClosed(0, 100);
		intstream.forEach(s -> sum += s);
		System.out.println(sum);
	}

}
