package Chap06.b_class_p201;

public class b_CarExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.201
		//객체 생성
		ba_Car myCar = new ba_Car(); //변수라 소문자
		//필드값 입력
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}

}
