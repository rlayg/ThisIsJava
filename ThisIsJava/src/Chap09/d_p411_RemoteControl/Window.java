package Chap09.d_p411_RemoteControl;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�ʵ� �ʱⰪ���� ����
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�");
			
		}
	};
	//�ʤ� ����� �ʱⰪ ����
	
	Window(){
		button1.setOnClickListener(listener);
		//�Ű������� �ʵ带 ����
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�");
				
			}
		});
		//�Ű������� �͸� ���� ��ü ����
	}
	

}
