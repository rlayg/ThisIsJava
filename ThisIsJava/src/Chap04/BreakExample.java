package Chap04;

public class BreakExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.131
		while(true) {
			int num = (int) (Math.random()*6)+1;
			System.out.println(num);
			
			if(num ==6) 
				break;
		}
		System.out.println("프로그램 종료");

	}

}
