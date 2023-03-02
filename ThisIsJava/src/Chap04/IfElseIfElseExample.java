package Chap04;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.112
		int score = 65 ;
		
		if(score >= 90) {
			System.out.println("점수가 90~100 사이입니다");
			System.out.println("등급은 A 입니다");
		} else if(score >= 80) {
			System.out.println("점수는 80~89 사이입니다");
			System.out.println("등급은 B 입니다");
		} else if (score >= 70) {
			System.out.println("점수는 70~79 사이입니다");
			System.out.println("등급은 C 입니다");
		} else {
			System.out.println("F 등급입니다");
		}

	}

}
