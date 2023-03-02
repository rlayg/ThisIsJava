package Chap06.a_class_p195;

public class a_StudentExample {
	public static void main(String[] args) {
		// 이것이 자바다 p.195
		aa_Student s1 = new aa_Student();
		System.out.println("s1변수가 Student 객체를 참조합니다.");
		
		aa_Student s2 = new aa_Student();
		System.out.println("s2변수가 또 다른 Student 객체를 참조합니다.");
		//여기까지는 새로운 클래스파일 Student를 참조
		
		Student_ s3 = new Student_(); // 이건 밑에 클래스 사용 선생님예
		System.out.println(s3.number);
		System.out.println(s3.school);
		
		ab_Student h1 = new ab_Student();
		System.out.println(h1.number); // 이 1이 되도록 새로운 class를 만든어주세요
	}

}


class Student_{
	int number = 3;
	String school = "Middle";
}// 근데 이러게 한방에 두개의 클래스가 있는건 안좋아 새 파일로 만드는게 좋아