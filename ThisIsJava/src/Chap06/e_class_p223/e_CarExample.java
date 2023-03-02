package Chap06.e_class_p223;

public class e_CarExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.223
		e_Car myCar = new e_Car();
		myCar.setGas(5); //Car의 setGas() 메소드 호출		
		boolean gasState = myCar.isLeftGas(); 
		/*
		 	gasState는 myCar.isLeftGas()메소드의 내용을 수행하고 반환값을 받음
		 	그런데 if(gasState)를 if(myCar.isLeftGas()) 로 넣게 되면, 위에서도 한번 실행되었는데,
			이곳 조건문 안에서도 myCar.isLeftGas() 의 메소드가 한번더 실행되므로, gas가 있습니다 가 한번더 출력이 됩니다.
			즉, 같은 메소드가 두번 호출되므로, 두번 출력이 이루어 집니다.
		*/
		if(gasState) {
//			이 자리에 myCar.isLeftGas() 넣으면 'gas가 있습니다'가 두번 나옴
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) { 
//			myCar.isLeftGas() 이 자리에 gasState 넣으면 가스 주입ㄴㄴ라고나옴
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}
//  
	}

}

//boolean gasState = myCar.isLeftGas();
//처음 여기에 현재의 가스 용량이 gasState에 저장이 됩니다.
//그리고 이후에 run()메소드를 실행하면서 gas가 소진이 됩니다.
//그런데 이 가스는 멤버변수 gas의 값이 감소하는 것이지 gasState값은 변함이 없습니다.
//마지막에
//if (myCar.isLeftGas()) {
//가 아니라
//if (gasState) {
//로 변변경하게 되면 gasState는 처음값을 그대로 가지고 있기 때문에 가스가 없다고 나오지 않고,
//가스를 주입할 필요가 없다고 나오는 것이지요^^
