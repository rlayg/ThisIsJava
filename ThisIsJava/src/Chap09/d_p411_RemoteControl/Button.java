package Chap09.d_p411_RemoteControl;

public class Button {
	// �̰��� �ڹٴ� p413
	//�������̽� Ÿ�� �ʵ�
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	//�Ű������� ������
	
	void touch() {
		listener.onClick();
	}
	//���� ��ü�� onClick() �޼ҵ� ȣ��
	
	interface OnClickListener{
		void onClick();
	}
	
	

}
