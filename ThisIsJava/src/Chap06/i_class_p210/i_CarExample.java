package Chap06.i_class_p210;

public class i_CarExample {

	public static void main(String[] args) {
		// 이것이 자바다 p,210 생성자
		ia_Car car1 = new ia_Car();
		System.out.println("car1.company : "+ car1.company);
		System.out.println();
		
		ia_Car car2 = new ia_Car("자가용");
		System.out.println("car2.company : "+ car2.company);
		System.out.println("car2.model : "+ car2.model);
		System.out.println();
		
		ia_Car car3 = new ia_Car("자가용", "빨강");
		System.out.println("car3.company : "+ car3.company);
		System.out.println("car3.model : "+ car3.model);
		System.out.println("car3.color : "+ car3.color);
		System.out.println();
		
		ia_Car car4 = new ia_Car("택시", "검정", 200);
		System.out.println("car4.company : "+ car4.company);
		System.out.println("car4.model : "+ car4.model);
		System.out.println("car4.color : "+ car4.color);
		System.out.println("car4.maxspeed : "+ car4.maxSpeed);
		

	}

}
