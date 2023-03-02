package Chap15.a_p728_ArrayListExample;

import java.util.Arrays;
import java.util.List;
public class ArraysAsListExample {

	public static void main(String[] args) {
		// 이것이 자바다 p729
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감바자");
		
		for(String name : list1) {
			System.out.println(name);
		}

		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		
		for(Integer value : list2) {
			System.out.println(value);
		}
	}

}
