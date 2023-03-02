package Chap10.b_p424_ArrayIndexOutOfboundsException;

public class ArrayIndecOutOfException2 {

	public static void main(String[] args) {
		// 3칸짜리 글자가 들어가는 배열을 만들고
		//각각을 출력을 합니다
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
		}//향상된 for문으로 바꿔본거
/*
 * 12줄 arr.length; 를 4로 바꾸면 예외 발생 어레이인덱스
 */
	}

}
