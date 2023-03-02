package Chap11.a_p459_Member;

public class MemberExample {

	public static void main(String[] args) {
		// 이것이 자바다 p 460
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다");
		}
	}

}
