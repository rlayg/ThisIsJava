package Chap06.i_class_p210;

public class ia_Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	ia_Car(){
	}
	
	ia_Car (String model) {//�ʵ� model�� �Ű����� model ���ڰ� ���Ƽ�
		this.model = model;//�ʵ忡 this�� �ٿ� ia_Car(��ü) ��ü �ڽ��� ����
	}
	ia_Car (String model, String color){
		this.model = model;
		this.color = color;
	}
	ia_Car (String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxspeed;
	}

}
