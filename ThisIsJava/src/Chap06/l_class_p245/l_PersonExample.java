package Chap06.l_class_p245;

public class l_PersonExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.245
		la_Person p1 = new la_Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";
//		p1.ssn = "676767-324234";  final 필드값 수정 불가능
		p1.name = "을지문덕"; // 수정가능
	}

}
