package Chap10.c_p426_NumberFormatException;

public class NumberFormatException {

	public static void main(String[] args) {
		// 이것이 자바다 p426
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); 
		//a100 문자열은 숫자로 변환 불가능해서
		//
		//NumberFormatException예외 발생
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 +"=" + result);
		
	}

}
