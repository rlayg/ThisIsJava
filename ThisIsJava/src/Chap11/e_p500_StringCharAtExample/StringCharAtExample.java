package Chap11.e_p500_StringCharAtExample;

public class StringCharAtExample {

	public static void main(String[] args) {
		// 이것이 자바다 p500
//		String ssn = "010624-1230123";
//		char sex = ssn.charAt(7);
//		
//		switch(sex) {
//		case '1':
//		case '3':
//			System.out.println("남자 입니다");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자 입니다");
//			break;
		
//		p501
		String str1 = new String("신민철");
		String str2 = "신민철";
		
		if(str1 == str2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(str1.equals(str2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
	}

}
