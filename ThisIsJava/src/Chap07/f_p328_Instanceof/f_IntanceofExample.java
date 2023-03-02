package Chap07.f_p328_Instanceof;

public class f_IntanceofExample {

		// 이것이 자바다 p.328
		public static void method1(f_Parent parent) {
			if(parent instanceof f_Child) {   //f_Child 타입으로 변환 가능한지 확인
				f_Child child = (f_Child) parent;
			System.out.println("method1 - f_Child로 변환 성공");
		} else {
			System.out.println("method1 - f_Child로 변환되지 않음");
		}
	}
	public static void method2(f_Parent parent) {
		f_Child child = (f_Child) parent;
		System.out.println("method2 - f_Child로 변환성공");
	}
		
		
		public static void main(String[] args) {
			
			f_Parent parentA = new f_Child();
			method1(parentA);
			method2(parentA);
			
			f_Parent parentB = new f_Parent();
			method1(parentB);
			method2(parentB); //예외발생
	}

}
