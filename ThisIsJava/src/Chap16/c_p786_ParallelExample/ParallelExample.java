package Chap16.c_p786_ParallelExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;

public class ParallelExample {
	public static void main(String[] args) {
		// 이것이 자바다 p786
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바", "람다식", "박병렬");
		
		//순차처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
//		stream.forEach(s -> ParallelExample.print(s));
//		위와 같다
		
		System.out.println();
	

	
		//병렬처리
		Stream<String> parallelStream = list.parallelStream();
//		parallelStream.forEach(ParallelExample :: print);
		parallelStream.forEach(a -> ParallelExample.print(a));
//		이건 왜 예외 나냐
		}
	
	public static void print(String str) {
		System.out.println(str + " " + Thread.currentThread().getName());
//		System.out.printf("%s %s\n", str, Thread.currentThread().getName());
//		위와 같다
		
	}

}
