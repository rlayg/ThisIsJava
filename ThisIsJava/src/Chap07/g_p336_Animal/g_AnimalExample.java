package Chap07.g_p336_Animal;

//import chap07.g_Cat;


public class g_AnimalExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.336
		g_Dog dog = new g_Dog();
		g_Cat cat = new g_Cat();
		dog.sound();
		cat.sound();
		System.out.println("____________");
		
		//������ �ڵ� Ÿ�� ��ȯ
		
		g_Animal animal = null;
		animal = new g_Dog();
		animal.sound();    
		//�ڵ� Ÿ�� ��ȯ �����ǵ� �޼ҵ� ȣ��
		animal = new g_Cat();
		animal.sound();
		//�ڵ� Ÿ�� ��ȯ �����ǵ� �޼ҵ� ȣ��
		System.out.println("_____________");
		
		//�޼ҵ��� ������
		animalSound(new g_Dog());
		animalSound(new g_Cat());
	}
	public static void animalSound(g_Animal animal) {
		animal.sound();

	}

}

