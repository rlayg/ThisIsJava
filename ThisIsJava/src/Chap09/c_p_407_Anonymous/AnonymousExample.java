package Chap09.c_p_407_Anonymous;

public class AnonymousExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p408
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.wake();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(
				new Person() {
					void study() {
						System.out.println("���θ� �մϴ�");
					}
					@Override
					void wake() {
						System.out.println("8�ÿ� �Ͼ�ϴ�");
						study();
					}
				}
		);

	}

}
