package Chap04;

public class Stringplus {

	public static void main(String[] args) {
		// concatenate concat�� �̿��� ���ڿ� ��ġ��
		String a = "Dragon";
		String b = "Fly";
		
		System.out.println("A= " + a + b);
		System.out.println("B= " + a.concat(b));
		// concat�� concatenate�� �ǹ�
		
		System.out.printf("B= %s%s", a, b);
		
	}

}
