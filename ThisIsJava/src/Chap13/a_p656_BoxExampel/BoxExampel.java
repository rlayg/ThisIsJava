package Chap13.a_p656_BoxExampel;

public class BoxExampel { // 비제네릭 타입 이용

	public static void main(String[] args) {
		// 이것이 자바다 p656
		Box box = new Box();
		box.set("홍길동"); //String -> object  자동 타입 변환
		String name = (String) box.get(); // Object -> String 강제타입변환
		
		System.out.println(name);
		
		box.set(new Apple()); //Apple -> object  자동 타입 변환
		Apple apple = (Apple) box.get(); // Object -> Apple 강제타입변환
		
		System.out.println(apple);
	}

}
