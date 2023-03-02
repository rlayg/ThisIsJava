package Chap07.g_p336_Animal;

public class g_SmartPhone extends g_Phone{//실체 클래스
	//생성자
	public g_SmartPhone(String owner) {
		super(owner);
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}

}
