package Chap05.b_p172_enum;

import java.util.Calendar;
public class eNUMwEEKeXAMPLE {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p 176
		
		Week today = null; //����Ÿ�� ���� ����
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//��(1)~��(7)������ ���ڸ� ����
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TYESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("���� ����: "+today);

		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�");
		} else {
			System.out.println("������ �ڹ� �����մϴ�");
		}
	}

}
