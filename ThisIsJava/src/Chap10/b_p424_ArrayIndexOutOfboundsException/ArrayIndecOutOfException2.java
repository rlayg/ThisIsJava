package Chap10.b_p424_ArrayIndexOutOfboundsException;

public class ArrayIndecOutOfException2 {

	public static void main(String[] args) {
		// 3ĭ¥�� ���ڰ� ���� �迭�� �����
		//������ ����� �մϴ�
		String[] arr = new String[3];
		arr[0] = "Hello";
		arr[1] = "Good Morning";
		arr[2] = "Good Evening";
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("");
		
		for(String string : arr) {
			System.out.println(string);
		}//���� for������ �ٲ㺻��
/*
 * 12�� arr.length; �� 4�� �ٲٸ� ���� �߻� ����ε���
 */
	}

}
