package Chap04;

public class Dice100 {
	public static void main(String[] args) {
		//주사위 1~100
		int dice100 = (int)(Math.random()*100) + 1;
		
		System.out.printf("%d 숫자가 뽑혔습니다\n", dice100);
		
		int dice6 = (int)(Math.random()*6) + 1;
		System.out.printf("%d 숫자가 뽑혔습니다", dice6);

	}

}
