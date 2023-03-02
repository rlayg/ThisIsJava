package Chap07.g_p336_Animal;

public abstract class g_Phone {//추사 클래스
	//필드
	public String owner;
	
	//생성자
	public g_Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}

}
