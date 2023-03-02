package Chap14.i_p695_FunctionExample;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93)
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
		// �̰��� �ڹٴ� p696
		double englishAvg = avg( s-> s.getEnglishScore());
		System.out.println("���� ���� ���: "+ englishAvg);
		
		double mathAvg = avg( s-> s.getMathScore());
		System.out.println("���� ���� ���: "+ mathAvg);

	}

}
