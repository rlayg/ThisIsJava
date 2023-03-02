package Chap14.m_p714_ArgumentMethodReferenceExample;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p714
		ToIntBiFunction<String, String> function;
		
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("java8", "JAVA8"));
		
		
	}
	
	
	public static void print(int order) {
		if(order<0) {System.out.println("���������� ���� �ɴϴ�");
	} else if(order == 0) {System.out.println("������ ���ڿ��Դϴ�");
	} else {System.out.println("���������� ���߿� �ɴϴ�");
	}
	}
	
}
