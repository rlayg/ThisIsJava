package Chap11.p_p561_DateTimeCompareExample;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	private static long remainDay;

	public static void main(String[] args) {
		// 이것이 자바다 p561
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("시작일: " + now);
		
		LocalDateTime endDateTime = LocalDateTime.of(2023, 12,25,12,00,00);
		System.out.println("종료일: " + endDateTime);
		
		remainDay = ChronoUnit.DAYS.between(now, endDateTime);
		System.out.println("end까지 남은 일: " + remainDay);
		
		
		Period period =
		Period.between(now.toLocalDate(), endDateTime.toLocalDate());
		System.out.println("남은 기간: "+ period.getYears()+"년 ");
		System.out.println(period.getMonths()+"달");
		System.out.println(period.getDays()+"일\n");
		

	}

}
