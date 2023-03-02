package Chap10.b_p424_ArrayIndexOutOfboundsException;

public class ArrayIndecOutOfException {

	public static void main(String[] args) {
		// 이것이 자바다 p.424
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}

}
/*
 * 두개의 실행 매개값을 주지 않음
 * 
 * Run configuration - Arguments - program arguments - 
 * Hello GoodMoring - 이렇게 값 주면 값 나옴
 * 다 안주거나 하나만 안줘도 예외발생
 */
