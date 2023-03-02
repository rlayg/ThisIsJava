package Chap16.c_p786_ParallelExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;

public class ParallelExample {
	public static void main(String[] args) {
		// �̰��� �ڹٴ� p786
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�", "���ٽ�", "�ں���");
		
		//����ó��
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
//		stream.forEach(s -> ParallelExample.print(s));
//		���� ����
		
		System.out.println();
	

	
		//����ó��
		Stream<String> parallelStream = list.parallelStream();
//		parallelStream.forEach(ParallelExample :: print);
		parallelStream.forEach(a -> ParallelExample.print(a));
//		�̰� �� ���� ����
		}
	
	public static void print(String str) {
		System.out.println(str + " " + Thread.currentThread().getName());
//		System.out.printf("%s %s\n", str, Thread.currentThread().getName());
//		���� ����
		
	}

}
