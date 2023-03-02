package Chap16.n_p821_ToListExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.821
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿", 10, Student.Sex.MALE ),
				new Student("�����", 6, Student.Sex.FEMALE ),
				new Student("�ſ��", 10, Student.Sex.MALE ),
				new Student("�ڼ���", 6, Student.Sex.FEMALE )
				);
		
//		���л��鸸 ���� List ����
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
				.forEach(s -> System.out.println(s.getName()));
		
//		���л��鸸 ���� List����
		List<Student> femaleList = totalList.stream()
				.filter(a -> a.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toList());
		femaleList.stream()
			.forEach(s -> System.out.println(s.getName()));

	}

}
