package Chap09.b_p403_NestedInterface;

public class Button {
	// �̰��� �ڹٴ� p402
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
