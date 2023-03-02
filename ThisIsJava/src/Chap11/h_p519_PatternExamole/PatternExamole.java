package Chap11.h_p519_PatternExamole;

import java.util.regex.Pattern;

public class PatternExamole {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p519
		String regExp = "(02|010)-\\d{3,2}-\\{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\+\\w+)?";
		data = "angle@navercom";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�");
		}

	}

}
