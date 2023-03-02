package Chap04;

public class Stringplus {

	public static void main(String[] args) {
		// concatenate concat을 이용한 문자열 합치기
		String a = "Dragon";
		String b = "Fly";
		
		System.out.println("A= " + a + b);
		System.out.println("B= " + a.concat(b));
		// concat은 concatenate의 의미
		
		System.out.printf("B= %s%s", a, b);
		
	}

}
