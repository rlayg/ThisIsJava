package Chap10.d_p428_ClassCastException;

public class ClassCastException {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� 428
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	public static void changeDog(Animal animal) {
//		if(animal instanceof Dog){
		Dog dog = (Dog) animal; // ClassCastException �߻� ����
//		}
	}
/*
 * 11���ο��� changeDog(cat); ���� Cat ��ü�� �Ű������� �־��� ������ 
 * DogŸ������ ��ȯ�� �� ����
 * �׷��� 15, 17������ �ּ��� Ǯ�� Ÿ��üũ�� ���� �ϴ°� ����
 */
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}