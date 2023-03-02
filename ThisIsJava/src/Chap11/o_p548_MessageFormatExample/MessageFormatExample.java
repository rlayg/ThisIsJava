package Chap11.o_p548_MessageFormatExample;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		// 이것이 자바다 p548
		
		String id = "java";
		String name = "신용권";
		String tel = "010-1234-5612";
		
		String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);;
		System.out.println();
		
		String sql = "insert info member values( {0}, {1}, {2} )";
		Object[] arguments = {"'java'", "'신용권'", "'010-1234-5612'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
//		String sql1 = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
//		Object[] arguments = {"java", "신용권", "010-1234-5612"};
//		String result3 = MessageFormat.format(sql1, arguments);
//		System.out.println(result3);


	}

}
