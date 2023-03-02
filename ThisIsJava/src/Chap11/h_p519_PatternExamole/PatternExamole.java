package Chap11.h_p519_PatternExamole;

import java.util.regex.Pattern;

public class PatternExamole {

	public static void main(String[] args) {
		// 이것이 자바다 p519
		String regExp = "(02|010)-\\d{3,2}-\\{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다");
		}else {
			System.out.println("정규식과 일치하지 않습니다");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\+\\w+)?";
		data = "angle@navercom";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다");
		} else {
			System.out.println("정규식과 일치하지 않습니다");
		}

	}

}
