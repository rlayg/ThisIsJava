package Chap05.a_Array;

public class b_ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// 이것이자바다 p.157
		//문자열 3개를 원소로 갖는 배열을 만들어 봅시다. 배열의 이름은 months
		//"Jan", "Feb", "Mar"
		int[] arr1 = new int[3];
		for(int i =0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}//int 초기값은 0이니까
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		double[] arr2 = new double[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}// double 초기값은 0.0 이니까
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		String[] arr3 = new String[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}//String 의 초기값은 null 이니까
		arr3[0] ="1월";
		arr3[1] ="2월";
		arr3[2] ="3월";
		for(int i =0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		

	}

}
