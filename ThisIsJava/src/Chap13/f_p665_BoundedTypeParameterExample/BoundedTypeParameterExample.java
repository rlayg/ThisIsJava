package Chap13.f_p665_BoundedTypeParameterExample;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p 665
//		String str = Util.compare("a", "b");  // �̰� �ȵȵ� "a" "b" �� String  Ÿ���� �ƴϷ�
		
		int result1 = Util.compare(10, 20);  // int -> Integer �ڵ� boxing
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);  // 4.5 double -> Double �ڵ� Boxing
		System.out.println(result2);

	}

}
