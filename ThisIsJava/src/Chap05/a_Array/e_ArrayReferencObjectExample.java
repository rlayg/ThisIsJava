package Chap05.a_Array;

public class e_ArrayReferencObjectExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.167
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]); //�ּҸ� �� - ���� ��ü�� ����(å)
		System.out.println(strArray[0] == strArray[2]); //�ּҰ�,���ȣ�� �ٸ��� - �ٸ� ��ü�� ����(å)
		System.out.println(strArray[0].equals(strArray[2])); // ���ڿ� ����(å)
	}

}



