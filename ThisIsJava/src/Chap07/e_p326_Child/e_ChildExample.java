package Chap07.e_p326_Child;

public class e_ChildExample {

	public static void main(String[] args) {
		// 이것이 자바다 p. 326
		e_Parent parent = new e_Child();
		parent.field1 = "date1";
		parent.method1();
		parent.method2();
		/*
		 * parent.field2 = "date2";
			parent.method3();
		 * 불가능
		 */
		e_Child child = (e_Child) parent;
		child.field2 = "yy"; //가능
		child.method3(); //가능
	}

}
