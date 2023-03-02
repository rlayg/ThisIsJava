package Chap09.d_p411_RemoteControl;

public class Button {
	// 이것이 자바다 p413
	//인터페이스 타입 필드
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	//매개변수의 다형성
	
	void touch() {
		listener.onClick();
	}
	//구현 객체의 onClick() 메소드 호출
	
	interface OnClickListener{
		void onClick();
	}
	
	

}
