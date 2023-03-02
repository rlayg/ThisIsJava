package Chap16.j_sec5_p800;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MapExample {

	public static void main(String[] args) {
		// 이것이 자바다 p803
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
				);
		
		studentList.stream()
//			.mapToInt(Student :: getScore)
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
	}

}
