package Chap05.a_Array;

public class f_ArrayCopyForExample {

	public static void main(String[] args) {
		// 이것이 자바다 p.167  배열복사
		//신축이래 이사가는거 예전엔 이렇게 만들었데 
		//요즘에는 ArrayList 쓴데 이건 한번하면 증축 못해
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
//		newIntArray[3] = 4;
//		newIntArray[4] = 5; // 배열 집어넣는거 이거 하면 1,2,3,4,5, 나옴
		for(int i = 0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
			
		}
		System.out.println("\n");
		System.out.println("-----");
		
		newIntArray[3] = 4;
		newIntArray[4] = 5; // 배열 집어넣는거
				
		for(int j: newIntArray) System.out.println(j);
		System.out.println("-----");

		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length ); // p168맨밑
//		src: source //출발점
//		dest: destination  // 종착점 //소스에서 데스티네이션이어디냐
//올드의 0번부터 뉴의 0부터 넣어라 몇개
		//p.168 맨밑
		for( int num : newIntArray) System.out.println(num);
	}

}
