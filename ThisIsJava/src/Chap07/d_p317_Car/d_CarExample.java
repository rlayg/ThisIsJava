package Chap07.d_p317_Car;

public class d_CarExample {
	public static void main(String[] args) {
		// 이것이 자바다 p.317
		d_Car car = new d_Car();
		
		for(int i = 1; i<5; i++) {
			int problemLocation = car.run();
			//car객체의 run()메소드 5번 반복 실행
			
			switch(problemLocation) { // 타이어 앞뒤오왼 펑크났을 떄 교체
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new d_HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new d_HankookTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new d_HankookTire("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new d_HankookTire("뒤오른쪽",17);
				break;
			}
			System.out.println("------------------");
			//1회전 시 출력되는 내용을 구분
			
		}
	}

}
