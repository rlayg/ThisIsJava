package Chap06.l_class_p245;

public class l_PersonExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.245
		la_Person p1 = new la_Person("123456-1234567", "���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";
//		p1.ssn = "676767-324234";  final �ʵ尪 ���� �Ұ���
		p1.name = "��������"; // ��������
	}

}
