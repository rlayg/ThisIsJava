package Chap13.b_p658_BoxExample;

public class BoxExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p658
		Box<String> box1 = new Box<>();  //new �ڿ� <>�� ���� ����
		box1.set("hello");
		String str = box1.get();
				
		Box<Integer> box2 = new Box<>();
		box2.set(6);
		int value = box2.get();
		
		
		System.out.println(box1.get());
		System.out.println(box2.get());

	}

}
