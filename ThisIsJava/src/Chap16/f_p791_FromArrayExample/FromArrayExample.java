package Chap16.f_p791_FromArrayExample;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class FromArrayExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p791
		String[] strArray = {"ȫ�浿", "�ſ��", "��̳�"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(s -> System.out.printf("%s, ", s));
		System.out.printf("\n");
		int[] intArray = { 1,2,3,4,5 };
		IntStream intstream = Arrays.stream(intArray);
		intstream.forEach(a -> System.out.printf("%d, ", a));
		

	}

}
