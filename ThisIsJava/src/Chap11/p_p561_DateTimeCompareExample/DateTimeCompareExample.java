package Chap11.p_p561_DateTimeCompareExample;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	private static long remainDay;

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p561
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("������: " + now);
		
		LocalDateTime endDateTime = LocalDateTime.of(2023, 12,25,12,00,00);
		System.out.println("������: " + endDateTime);
		
		remainDay = ChronoUnit.DAYS.between(now, endDateTime);
		System.out.println("end���� ���� ��: " + remainDay);
		
		
		Period period =
		Period.between(now.toLocalDate(), endDateTime.toLocalDate());
		System.out.println("���� �Ⱓ: "+ period.getYears()+"�� ");
		System.out.println(period.getMonths()+"��");
		System.out.println(period.getDays()+"��\n");
		

	}

}
