package Chap15.e_p743_HashMapExample;

import java.util.*;

public class HashMapExample2 {

	public static void main(String[] args) {
		// 이것이 자바다 p745
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		System.out.println("총 Entry 수: " + map.size());
	}

}
