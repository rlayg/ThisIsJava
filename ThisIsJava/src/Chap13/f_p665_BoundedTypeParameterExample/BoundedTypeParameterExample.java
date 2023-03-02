package Chap13.f_p665_BoundedTypeParameterExample;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		// 이것이 자바다 p 665
//		String str = Util.compare("a", "b");  // 이거 안된데 "a" "b" 가 String  타입이 아니래
		
		int result1 = Util.compare(10, 20);  // int -> Integer 자동 boxing
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);  // 4.5 double -> Double 자동 Boxing
		System.out.println(result2);

	}

}
