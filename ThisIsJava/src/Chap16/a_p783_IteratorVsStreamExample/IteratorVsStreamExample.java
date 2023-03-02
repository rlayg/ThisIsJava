package Chap16.a_p783_IteratorVsStreamExample;

import java.util.*;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p783
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
		
		//Iterator ���
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		//stream �̿�
		
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));

	}

}
