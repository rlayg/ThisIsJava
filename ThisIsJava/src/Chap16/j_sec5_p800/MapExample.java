package Chap16.j_sec5_p800;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MapExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p803
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
				);
		
		studentList.stream()
//			.mapToInt(Student :: getScore)
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
	}

}
