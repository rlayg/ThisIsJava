package Chap11.o_p548_MessageFormatExample;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p548
		
		String id = "java";
		String name = "�ſ��";
		String tel = "010-1234-5612";
		
		String text = "ȸ�� ID: {0} \nȸ�� �̸�: {1} \nȸ�� ��ȭ: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);;
		System.out.println();
		
		String sql = "insert info member values( {0}, {1}, {2} )";
		Object[] arguments = {"'java'", "'�ſ��'", "'010-1234-5612'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
//		String sql1 = "ȸ�� ID: {0} \nȸ�� �̸�: {1} \nȸ�� ��ȭ: {2}";
//		Object[] arguments = {"java", "�ſ��", "010-1234-5612"};
//		String result3 = MessageFormat.format(sql1, arguments);
//		System.out.println(result3);


	}

}
