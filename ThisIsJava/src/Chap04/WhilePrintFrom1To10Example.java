package Chap04;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;//이것이 자바 p.125위
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----------");
		
		int sum = 0; //이것이 자바다 p.125밑
		int a = 1; // 카운터변수  p.123 위쪽예제도 비슷함
		while(a<=100) {
			sum += a
					;
			a++;
		}
		System.out.printf("1 ~ %d 합: %d\n", a-1, sum);
		System.out.println("1~" + (a-1) + " 합 : " + sum );
		System.out.println("-----------");
		
		//1부터 100까지 짝수들의 합을 구하면?
		int sum2 = 0;
		int b = 0;
		while(b<=100) {
			sum2 += b;
			b += 2;
		}
		System.out.println(sum2);
		
		//위 동 다른방법 for 사용
		
		int sum3 = 0;
		for(int c = 1; c<=100; c++) {
			if(c%2 ==0) {
				sum3 += c;
			}
		}
		System.out.println(sum3);
		
						
	}

}
