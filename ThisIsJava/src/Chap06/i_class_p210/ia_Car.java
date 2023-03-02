package Chap06.i_class_p210;

public class ia_Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	ia_Car(){
	}
	
	ia_Car (String model) {//필드 model과 매개변수 model 문자가 같아서
		this.model = model;//필드에 this를 붙여 ia_Car(객체) 객체 자신을 참조
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
