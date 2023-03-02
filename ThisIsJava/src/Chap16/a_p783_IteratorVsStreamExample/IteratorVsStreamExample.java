package Chap16.a_p783_IteratorVsStreamExample;

import java.util.*;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		// 이것이 자바다 p783
		List<String> list = Arrays.asList("홍길동", "신용권", "김자바");
		
		//Iterator 사용
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		//stream 이용
		
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));

	}

}
