package Chap16.m_p815_OptionalExample;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
//		이것이 자바다 p815
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		/*
		 NoSuchElementException 예외 발생
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.getAsDouble();
		*/
		
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
				if(optional.isPresent()) {
					System.out.println("방법1_평균 : " + optional.getAsDouble());
				} else {
					System.out.println("방법1_평균 : " + 0.0);
				}
		
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법2_평균 : " + avg);
		
		list.stream()
		.mapToInt(Integer :: intValue)
		.average()
		.ifPresent(a -> System.out.println("방법3_평균 : " + a));
		
		
		
		
	}

}
