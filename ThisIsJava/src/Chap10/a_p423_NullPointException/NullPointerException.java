package Chap10.a_p423_NullPointException;

public class NullPointerException {

	public static void main(String[] args) {
		// 이것이 자바다 p423
		String data = null;
		System.out.println(data.toString());

	}

}
/*
NullPointerException 예외가 발생
null에 값이 없어서 값이 없다는 예외
*/