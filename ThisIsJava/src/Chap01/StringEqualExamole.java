package Chap01;

public class StringEqualExamole {

	public static void main(String[] args) {
		// ¿Ã∞Õ¿Ã ¿⁄πŸ¥Ÿ p.91
		String strVar1 = "Ω≈πŒ√∂";
		String strVar2 = "Ω≈πŒ√∂";
		String strVar3 = new String("Ω≈πŒ√∂");
		
		System.out.println( strVar1 == strVar2); // ∞∞¿∫ ∞¥√ºæ»¿« Ω≈πŒ√∂
		System.out.println( strVar1 == strVar3); // ¥Ÿ∏• ∞¥√ºæ»¿« Ω≈πŒ√∂
		System.out.println();
		System.out.println( strVar1.equals(strVar2));// πÆ¿⁄∏∏ µø¿œ«—¿⁄ »Æ¿Œ equals
		System.out.println( strVar1.equals(strVar3));// ¿ßµø

	}

}
