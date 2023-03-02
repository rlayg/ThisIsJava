package Chap16.b_p784_LambdaExpressionExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {
	public static void main(String[] args) {
	//이것이 자바다 p784
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("신용권", 92)
				);
		
		Stream<Student> stream = list.stream();
//		stream.forEach( s -> {
//			String name = s.getName();
//			int score = s.getScore();
//			System.out.println(name + "-" + score);
//		});
		
		stream.forEach(Student :: printInfo); // student.printInfo();
//		stream.forEach(LambdaExpressionExample :: printInfo); // LambdaExpressionExample.printInfo(student);
		
	
		
	
	}
	public static void printInfo(Student student) {
		System.out.println(student.getName() + "-" + student.getScore());
	}

	
}
