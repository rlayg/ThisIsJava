package Chap05.a_Array;

public class e_ArrayReferencObjectExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.167
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]); //주소를 비교 - 같은 객체를 참조(책)
		System.out.println(strArray[0] == strArray[2]); //주소가,방번호가 다르다 - 다른 객체를 참조(책)
		System.out.println(strArray[0].equals(strArray[2])); // 문자열 동일(책)
	}

}



