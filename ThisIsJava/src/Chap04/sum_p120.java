package Chap04;

public class sum_p120 {
	public static void main(String[] args) {
		int sum = 0; // 1~100 까지의 합
		for(int i= 1; i<=100; i++ ) {
			sum += i;
			System.out.printf("1~100까지의 합: %d\n", sum);
		}
		System.out.printf("1~100까지의 합: %d\n", sum);
		
		int sum2 = 0; //1부터 100까지 짝수의 합
		for(int i = 0; i<=100; i+=2) {
			sum2 +=i; 
		}
			System.out.println(sum2);
	}

}
