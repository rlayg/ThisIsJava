package Chap16.d_p788_MapAndReduceExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MapAndReduceExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p788
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
				);
		
		double avg = studentList.stream()
				//�߰�ó�� �л� ��ü�� ������ ����
//				.mapToInt(Student :: getScore)
				.mapToInt(sdf -> sdf.getScore()) //sdf sdf. �� ���ƾ���
				//����ó�� �������
				.average()
				.getAsDouble();
		
		
		
				
			System.out.println("�������: " + avg);

	}

}
