package Chap06.h_class_p232;

public class h_CalculatorExample {

	public static void main(String[] args) {
		// 이것이 자바다 p. 232 매소드오버로딩
		ha_Calculator myCalcu = new ha_Calculator();
		
		//정사격형 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//선생님예 하나 더 숫자뒤에 .0 없애래 
		int result3 = myCalcu.areaRectangle(10, 12);
		//결과 출력
		System.out.println("정사각형의 넓이= "+result1);
		System.out.println("직사각형의 넓이= "+result2);
		System.out.println("직사각형의 넓이= "+result3);
	}//인자개수 뿐만 아니라 데이터 타입도 다른거 만들때마다 다 따로 만들어야함

}
