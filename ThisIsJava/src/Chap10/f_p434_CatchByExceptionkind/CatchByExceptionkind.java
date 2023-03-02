package Chap10.f_p434_CatchByExceptionkind;

public class CatchByExceptionkind {

	public static void main(String[] args) {
		// 이것이 자바다 p434
		try {
		String data1 = args[0];
		String data2 = args[1];
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 +"=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionkind num1 num2");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
	}
	/*
	 * 두개의 실행 매개값을 주지 않음
	 *
	 * Run configuration - Arguments - program arguments - 
	 * ㄱ ㄴ - 이렇게 값 주면 값 나옴
	 * 다 안주거나 하나만 안줘도 예외발생
	 * 
	 * 근데 값을 ㄱ ㄴ 으로 주면 밑에 예외가 발생
	 * 
	 * 숫자 2개 넣으면 덧셈 실행하고 다시 실행하세요가 출력되네
	 * e_ 와 비슷비슷 
	 * 초반에 에러 발생하면 밑에것 다 중지 다 따로따로 보고싶으면
	 * 전것처럼  try를 다 따로따로 넣어줘야함
	 */
}
