package Chap07.g_p336_Animal;

//import chap07.g_Cat;


public class g_AnimalExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.336
		g_Dog dog = new g_Dog();
		g_Cat cat = new g_Cat();
		dog.sound();
		cat.sound();
		System.out.println("____________");
		
		//변수의 자동 타입 변환
		
		g_Animal animal = null;
		animal = new g_Dog();
		animal.sound();    
		//자동 타입 변환 재정의된 메소드 호출
		animal = new g_Cat();
		animal.sound();
		//자동 타입 변환 재정의된 메소드 호출
		System.out.println("_____________");
		
		//메소드의 다형성
		animalSound(new g_Dog());
		animalSound(new g_Cat());
	}
	public static void animalSound(g_Animal animal) {
		animal.sound();

	}

}

