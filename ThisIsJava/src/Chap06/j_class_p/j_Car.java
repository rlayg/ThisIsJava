package Chap06.j_class_p;

public class j_Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	j_Car(){
		
	}
	
	j_Car(String model){
		this(model, "����", 250);
		
	}
	j_Car(String model, String color){
		this(model, color, 250);
	}
	
	j_Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
