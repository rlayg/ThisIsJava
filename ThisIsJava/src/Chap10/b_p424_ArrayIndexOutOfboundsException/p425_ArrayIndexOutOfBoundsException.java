package Chap10.b_p424_ArrayIndexOutOfboundsException;

public class p425_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// 이것이 자바다 p425
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java Array IndexOutOfBoundsException");
			System.out.println("값1 값2");
		}
	}
}
/*
 *예제를 이렇게 수정하면  ArrayIndexOutOfBoundsException
 *이 발생하지 않는 프로그램이 됨
 *배열값을 읽기 전에 배열의 길이를 먼저 조사하는 것
 *실행 매개값이 없거나 부족하면 조건문을 이용해서 사용자에게 실행방법을 알려줌
 */

