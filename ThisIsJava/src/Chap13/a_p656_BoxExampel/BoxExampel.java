package Chap13.a_p656_BoxExampel;

public class BoxExampel { // �����׸� Ÿ�� �̿�

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p656
		Box box = new Box();
		box.set("ȫ�浿"); //String -> object  �ڵ� Ÿ�� ��ȯ
		String name = (String) box.get(); // Object -> String ����Ÿ�Ժ�ȯ
		
		System.out.println(name);
		
		box.set(new Apple()); //Apple -> object  �ڵ� Ÿ�� ��ȯ
		Apple apple = (Apple) box.get(); // Object -> Apple ����Ÿ�Ժ�ȯ
		
		System.out.println(apple);
	}

}
