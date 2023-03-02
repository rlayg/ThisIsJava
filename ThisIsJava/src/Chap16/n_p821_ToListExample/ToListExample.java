package Chap16.n_p821_ToListExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.821
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE ),
				new Student("김수애", 6, Student.Sex.FEMALE ),
				new Student("신용권", 10, Student.Sex.MALE ),
				new Student("박수미", 6, Student.Sex.FEMALE )
				);
		
//		남학생들만 묶어 List 생성
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
				.forEach(s -> System.out.println(s.getName()));
		
//		여학생들만 묶어 List생성
		List<Student> femaleList = totalList.stream()
				.filter(a -> a.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toList());
		femaleList.stream()
			.forEach(s -> System.out.println(s.getName()));

	}

}
