package Chap14.i_p695_FunctionExample;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
			);
	
	public static double avg( ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}

	public static void main(String[] args) {
		// 이것이 자바다 p696
		double englishAvg = avg( s-> s.getEnglishScore());
		System.out.println("영어 점수 평균: "+ englishAvg);
		
		double mathAvg = avg( s-> s.getMathScore());
		System.out.println("수학 점수 평균: "+ mathAvg);

	}

}
