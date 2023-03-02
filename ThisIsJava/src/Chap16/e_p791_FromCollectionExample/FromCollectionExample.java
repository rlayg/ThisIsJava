package Chap16.e_p791_FromCollectionExample;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

import Chap16.b_p784_LambdaExpressionExample.Student;

public class FromCollectionExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p790
		List<Student> studentList= Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
				);
		
		Stream<Student> stream = studentList.stream();
			
		stream.forEach(s -> System.out.println(s.getName()));
//		stream.forEach(FromCollectionExample :: printInfo);
		

	}

public static void printInfo(Student student) {
	System.out.println(student.getName());
}
//�޼ҵ� ������

}

