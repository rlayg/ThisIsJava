package Chap06.a_class_p195;

public class a_StudentExample {
	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.195
		aa_Student s1 = new aa_Student();
		System.out.println("s1������ Student ��ü�� �����մϴ�.");
		
		aa_Student s2 = new aa_Student();
		System.out.println("s2������ �� �ٸ� Student ��ü�� �����մϴ�.");
		//��������� ���ο� Ŭ�������� Student�� ����
		
		Student_ s3 = new Student_(); // �̰� �ؿ� Ŭ���� ��� �����Կ�
		System.out.println(s3.number);
		System.out.println(s3.school);
		
		ab_Student h1 = new ab_Student();
		System.out.println(h1.number); // �� 1�� �ǵ��� ���ο� class�� ������ּ���
	}

}


class Student_{
	int number = 3;
	String school = "Middle";
}// �ٵ� �̷��� �ѹ濡 �ΰ��� Ŭ������ �ִ°� ������ �� ���Ϸ� ����°� ����