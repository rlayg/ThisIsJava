package Chap01;

public class IntExample {
	public static void main(String[] args) {
//		long var1 = 10; //10������ ����
//		long var2 = 20L; //8������ ����
//		long var3 = 1000000000000; //16������ ���� ����
//		long var4 = 10000000000000L;
//		System.out.println(var1);
//		System.out.println(var2);
//		System.out.println(var3); ����
//		System.out.println(var4);
		
		
		byte byteValue = 10;
		int intValue = byteValue; //int <- byte
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue; //int<-char
		System.out.println("���� �����ڵ�=" + intValue);
		
		intValue = 500;
		long longValue = intValue; //long<-int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; // double <- int
		System.out.println(doubleValue);
		
	}

}
