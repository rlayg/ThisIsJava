package Chap06.c_class_p219;

public class ca_Calculator {
	//�޼ҵ�
	void powerOn() { 
		System.out.println("������ �մϴ�.");
	  	}
		
		int plus(int x, int y) {
			int result = x + y;
			return result;
		}
		
		int multiple(int x, int y) {
			int result = x * y;
			return result;
		}
		
		double divide(int x, int y) {
			double result = (double)x / (double)y;
			return result;
		}
		void powerOff() {
			System.out.println("������ ���ϴ�.");
		}
	
}
