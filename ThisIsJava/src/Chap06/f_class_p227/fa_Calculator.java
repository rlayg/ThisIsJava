package Chap06.f_class_p227;

public class fa_Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	void execute() {
		double result = avg(7, 9);
		println("실행결과: " + result);
	}
	void println(String message) {
		System.out.println(message);
	}

}
