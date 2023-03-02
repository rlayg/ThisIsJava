package Chap16.j_sec5_p800;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {

	public static void main(String[] args) {
		// 이것이 자바다 p 805
		int[] intArray = {1, 2, 3, 4, 5};
		
		IntStream intStream =Arrays.stream(intArray);
		intStream
		.asDoubleStream()
		.forEach(d -> System.out.println(d));
		
		System.out.println();
		
		intStream =Arrays.stream(intArray);
		intStream
		.boxed()
		.forEach(obj -> System.out.println(obj.intValue()));
		
	}

}
