package Chap04;

public class ForPrint1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<10 ; i++) {
			System.out.println(i);
			
		}
		System.out.println("------------");
		for(int q = 0; q < 10; q+=2) { //¦���̱�
			System.out.println(q);
			
		}
		System.out.println("------------");
		for(int w = 1; w<=10; w+=1) { //¦���̱�
			if(w%2 == 0) {
				System.out.println(w);
				
			}
		}
		System.out.println("------------");
		for(int r = 0; r <10; r++) { // 3���� ���� �������� 1�μ��� ���
			if(r%3 == 1) {
				System.out.println(r);
				
			}
		}
		System.out.println("------------");
		for(int t = 1; t<=3; t++) { //121212 ����� ��ø(nested) for��
			for(int y = 1; y <= 2; y++) {
				System.out.println(y);
			}
		}

	}

}
