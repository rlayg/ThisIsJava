package Chap16.i_p800_FilteringExample;

import java.util.Arrays;
import java.util.List;

public class ageAvg {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p800
		List<String> names = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�", "�ſ��", "�Ź�ö");
		
		names.stream()
		.distinct()
		.forEach(s -> System.out.println(s));
		
		System.out.printf("\n");
		
		names.stream()
		.filter(s -> s.startsWith("��"))
		.forEach(a -> System.out.println(a));
		
		System.out.printf("\n");
		
		names.stream()
		.distinct()
		.filter(s -> s.startsWith("��"))
		.forEach(s -> System.out.println(s));
	}

}
