package Chap13.d_p661_BoxingMethodExample;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p 662
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box<String> box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();

		
		System.out.println(intValue);
		System.out.println(strValue);
	}

}
