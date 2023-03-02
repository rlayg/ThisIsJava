package Chap06.d_class_p220;

public class da_Computer {
int sum1(int[] values) {
	int sum = 0;
	for(int i = 0; i<values.length; i++) {
		sum += values[i];
	}
	return sum;
	}
int sum2 (int ... values) {
	int sum = 0;
	for(int i = 0; i<values.length; i++) {
		sum += values[i];
	}
	return sum;
}//위 두개가 같데
}
