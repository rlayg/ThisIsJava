package Chap01;

public class IntExample {
	public static void main(String[] args) {
//		long var1 = 10; //10진수로 저장
//		long var2 = 20L; //8진수로 저장
//		long var3 = 1000000000000; //16진수로 저장 에러
//		long var4 = 10000000000000L;
//		System.out.println(var1);
//		System.out.println(var2);
//		System.out.println(var3); 에러
//		System.out.println(var4);
		
		
		byte byteValue = 10;
		int intValue = byteValue; //int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; //int<-char
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue; //long<-int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; // double <- int
		System.out.println(doubleValue);
		
	}

}
