package Chap07.g_p336_Animal;

public class g_PhoneExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.333
		
		//g_Phone = new g_Phone()
		g_SmartPhone smartPhone = new g_SmartPhone("홍길동");
		
		smartPhone.turnOn(); // g_Phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); // g_Phone의 메소드

	}

}
