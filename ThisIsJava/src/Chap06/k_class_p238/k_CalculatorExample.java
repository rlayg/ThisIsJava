package Chap06.k_class_p238;

public class k_CalculatorExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.238
		double result1 = 10 * 10 * ka_Calculator.pi;
		int result2 = ka_Calculator.plus(10, 5);
		int result3 = ka_Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		//선생님 예 
		System.out.printf("%.2f",Math.PI);
		//1~6정수 주사위
		
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		
		
		

	}

}
