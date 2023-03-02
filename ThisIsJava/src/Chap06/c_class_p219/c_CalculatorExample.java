package Chap06.c_class_p219;

public class c_CalculatorExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.219
		ca_Calculator myCalc = new ca_Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: " + result1);
		
		int result3 = myCalc.multiple(3, 2)		;
		System.out.println("result3: " + result3);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
		}

}
//void ()
//는 return 0;
//이 안보이게 있다
