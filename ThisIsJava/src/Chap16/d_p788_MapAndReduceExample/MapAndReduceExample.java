package Chap16.d_p788_MapAndReduceExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MapAndReduceExample {

	public static void main(String[] args) {
		// 이것이 자바다 p788
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
				);
		
		double avg = studentList.stream()
				//중간처리 학생 객체를 점수로 매핑
//				.mapToInt(Student :: getScore)
				.mapToInt(sdf -> sdf.getScore()) //sdf sdf. 은 같아야함
				//최종처리 평균점수
				.average()
				.getAsDouble();
		
		
		
				
			System.out.println("평균점수: " + avg);

	}

}
