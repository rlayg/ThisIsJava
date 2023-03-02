package Chap06.n_class_p267;

public class n_CarExamole {

	public static void main(String[] args) {
		// 이것이 자바다 p.267
		na_Car myCar = new na_Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재속도: " + myCar.getSpeed());
		
		//옳바른 속도변경
		myCar.setSpeed(60);
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도: " + myCar.getSpeed());

	}

}
