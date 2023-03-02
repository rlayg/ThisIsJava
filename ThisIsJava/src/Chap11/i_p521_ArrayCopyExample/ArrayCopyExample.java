package Chap11.i_p521_ArrayCopyExample;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p521
		char [] arr1 = {'J', 'A', 'V', 'A'};
		
		System.out.println(arr1);
		
		//���
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); 
		//arr1 ��ü�� arr2�� ����
		
		System.out.println(Arrays.toString(arr2));
		
		//���2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); 
		System.out.println(Arrays.toString(arr3));
		
		//���3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i = 0; i<arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}

	}

}
