package Chap07.b_p311_Child;

public class b_ChildExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.311
		bb_Child child = new bb_Child();
//		ba_Parent parent = bb_Child; //위와 같다
		
		ba_Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3();  호출 불가능

	}

}
