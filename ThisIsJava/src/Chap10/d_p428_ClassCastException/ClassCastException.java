package Chap10.d_p428_ClassCastException;

public class ClassCastException {

	public static void main(String[] args) {
		// 이것이 자바다 428
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	public static void changeDog(Animal animal) {
//		if(animal instanceof Dog){
		Dog dog = (Dog) animal; // ClassCastException 발생 가능
//		}
	}
/*
 * 11라인에서 changeDog(cat); 에서 Cat 객체를 매개값으로 주엇기 떄문에 
 * Dog타입으로 변환할 수 없다
 * 그래서 15, 17라인의 주석을 풀어 타입체크를 먼저 하는게 좋다
 */
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}