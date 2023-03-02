package Chap05.a_Array;

public class f_ArrayCopyForExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.167  �迭����
		//�����̷� �̻簡�°� ������ �̷��� ������� 
		//���򿡴� ArrayList ���� �̰� �ѹ��ϸ� ���� ����
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
//		newIntArray[3] = 4;
//		newIntArray[4] = 5; // �迭 ����ִ°� �̰� �ϸ� 1,2,3,4,5, ����
		for(int i = 0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
			
		}
		System.out.println("\n");
		System.out.println("-----");
		
		newIntArray[3] = 4;
		newIntArray[4] = 5; // �迭 ����ִ°�
				
		for(int j: newIntArray) System.out.println(j);
		System.out.println("-----");

		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length ); // p168�ǹ�
//		src: source //�����
//		dest: destination  // ������ //�ҽ����� ����Ƽ���̼��̾���
//�õ��� 0������ ���� 0���� �־�� �
		//p.168 �ǹ�
		for( int num : newIntArray) System.out.println(num);
	}

}
