package Chap15.e_p743_HashMapExample;

import java.util.*;

public class HashMapExample2 {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p745
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 95);
		
		System.out.println("�� Entry ��: " + map.size());
	}

}
