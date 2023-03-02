package Chap09.d_p411_RemoteControl;

public class AnonymousExample {

	public static void main(String[] args) {
		// p412
		Anonymous anony = new Anonymous();
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		//�͸� ��ü ���� ���� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTv�� �մϴ�");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTv�� ���ϴ�");
				
			}
		});

	}

}
