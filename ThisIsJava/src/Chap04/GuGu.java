package Chap04;

public class GuGu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i<=9; i++) {
			System.out.println(i + " 단 입니다");
			for(int j = 1; j <=9; j++) {
				System.out.println("\t"+i + " * " + j + " = " + i*j);
				System.out.printf("\t%d X %d = %d\n",i,j,i*j);
			}
		}
		for(int i = 1; i<=9; i++) {
			System.out.println(i + "단 입니다");
			for(int a = 1; a<=9; a++) {
				for(int b = 1; b<=9; b++) {
					System.out.printf("\t%d X %d X %d = %d\n",i,a,b,i*a*b);
				}
			}
		}
	}

}
