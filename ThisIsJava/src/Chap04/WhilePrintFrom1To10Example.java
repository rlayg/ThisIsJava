package Chap04;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;//�̰��� �ڹ� p.125��
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----------");
		
		int sum = 0; //�̰��� �ڹٴ� p.125��
		int a = 1; // ī���ͺ���  p.123 ���ʿ����� �����
		while(a<=100) {
			sum += a
					;
			a++;
		}
		System.out.printf("1 ~ %d ��: %d\n", a-1, sum);
		System.out.println("1~" + (a-1) + " �� : " + sum );
		System.out.println("-----------");
		
		//1���� 100���� ¦������ ���� ���ϸ�?
		int sum2 = 0;
		int b = 0;
		while(b<=100) {
			sum2 += b;
			b += 2;
		}
		System.out.println(sum2);
		
		//�� �� �ٸ���� for ���
		
		int sum3 = 0;
		for(int c = 1; c<=100; c++) {
			if(c%2 ==0) {
				sum3 += c;
			}
		}
		System.out.println(sum3);
		
						
	}

}
