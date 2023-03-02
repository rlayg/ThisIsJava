package Chap06.j_class_p;

public class j_Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	j_Car(){
		
	}
	
	j_Car(String model){
		this(model, "은색", 250);
		
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
