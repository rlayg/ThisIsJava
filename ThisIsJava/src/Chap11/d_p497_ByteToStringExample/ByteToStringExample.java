package Chap11.d_p497_ByteToStringExample;

public class ByteToStringExample {

	public static void main(String[] args) {
		// 이것이자바다 p497
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);

	}

}
