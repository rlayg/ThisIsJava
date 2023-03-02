package Chap11.f_p498_507_StringSubstringExample;

public class StringSubstringExample {

	public static void main(String[] args) {
		// 이것이 자바다 p507
		String str4 = "자바 프로그래밍";
		System.out.println(str4.charAt(4));
		System.out.println(str4.indexOf('프'));
		System.out.println(str4.indexOf("그래밍"));
		System.out.println(str4.length());
		
		System.out.println(str4.replace("자바", "--"));
		
		System.out.println(str4.substring(0, 2));
		System.out.println(str4.substring(3, 8));
		System.out.println(str4.substring(3));

		String str5 = "   Good Morning    ";
		System.out.println(str5.toLowerCase());
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase().toUpperCase()); //소문자했다가대문자로바꿔라
		System.out.println(str5.trim()); //양옆 공백 없애줌
		System.out.println(str5.strip()); //양옆 공백 없애줌
		
		System.out.println(String.valueOf(10)); // 문자열 변환
		
		

	}

}
