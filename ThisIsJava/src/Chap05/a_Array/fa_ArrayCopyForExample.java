package Chap05.a_Array;

public class fa_ArrayCopyForExample {
	public static void main(String[] args) {
		String[] old = {"1", "2", "3"};
		String[] newArray = new String[5];

		newArray  = old;
		
		for(String num : newArray) System.out.print(num+", ");
			System.out.println();
			System.out.println();	
		
			old[0] = "100";	//old�� 0����ü(�ּҾ���)�� ������ �مf��
			
		for(String num : newArray) System.out.print(num+", ");
			System.out.println();	
			System.out.println();
			
		for(String num : old) System.out.print(num+", "); 
			System.out.println();

	}

}//p 169  �������縦 �ǹ��Ѵ� �õ� 100�� �مf�µ� ���� ��µ� 100���� �ٲ����
