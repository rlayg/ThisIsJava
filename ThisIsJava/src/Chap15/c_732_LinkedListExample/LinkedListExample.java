package Chap15.c_732_LinkedListExample;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
	//�̰��� ��� p 732
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime = 0;
		
		startTime = System.nanoTime();
		for(int i = 0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		System.out.println("ArrayList �ɸ��ð�: "+ (endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		System.out.println("LinkedList �ɸ��ð�: "+ (endTime-startTime)+"ns");

}
}
