package Chap05.a_Array;

public class b_ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// �̰����ڹٴ� p.157
		//���ڿ� 3���� ���ҷ� ���� �迭�� ����� ���ô�. �迭�� �̸��� months
		//"Jan", "Feb", "Mar"
		int[] arr1 = new int[3];
		for(int i =0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}//int �ʱⰪ�� 0�̴ϱ�
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		double[] arr2 = new double[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}// double �ʱⰪ�� 0.0 �̴ϱ�
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		String[] arr3 = new String[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}//String �� �ʱⰪ�� null �̴ϱ�
		arr3[0] ="1��";
		arr3[1] ="2��";
		arr3[2] ="3��";
		for(int i =0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		

	}

}
