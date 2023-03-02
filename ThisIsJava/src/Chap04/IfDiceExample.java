package Chap04;

public class IfDiceExample {
	public static void main(String[] args) {
		//이것이 자바다 p.114
		int num = (int)(Math.random()*6) + 1;
		
		if(num == 6) {
			System.out.println("주사위 숫자는 6입니다");
		} else if(num == 5) {
			System.out.println("주사위 숫자는 5입니다");
		} else if(num == 4) {
			System.out.println("주사위 숫자는 4입니다");
		} else if(num == 3) {
			System.out.println("주사위 숫자는 3입니다");
		} else if(num == 2) {
			System.out.println("주사위 숫자는 2입니다");
//		} else if(num == 1) {
//			System.out.println("주사위 숫자는 1입니다");
//			이렇게 해도 되지만 밑에로 하자
		}else {
			System.out.println("주사위 숫자는 1입니다");
		}
		
			// 런 시킬때마다 주사위 숫자가 다르게 나온다
	}

}
