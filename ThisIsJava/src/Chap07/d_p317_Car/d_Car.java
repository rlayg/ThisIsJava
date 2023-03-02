package Chap07.d_p317_Car;

public class d_Car {
	//필드 // 자동차는 4개의 타이어를 가진다
	d_Tire frontLeftTire = new d_Tire("앞왼쪽", 6);
	d_Tire frontRightTire = new d_Tire("앞오른쪽", 2);
	d_Tire backLeftTire = new d_Tire("뒤왼쪽", 3);
	d_Tire backRightTire = new d_Tire("뒤오른쪽", 4);
	
	//생성자
	
	//메소드
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return 1;}
		if(frontRightTire.roll()==false) { stop(); return 2;}
		if(backLeftTire.roll()==false) { stop(); return 3;}
		if(backRightTire.roll()==false) { stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]"); // 펑크났을때 실행
	}

}
