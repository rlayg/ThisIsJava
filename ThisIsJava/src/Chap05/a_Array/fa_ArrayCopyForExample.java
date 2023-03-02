package Chap05.a_Array;

public class fa_ArrayCopyForExample {
	public static void main(String[] args) {
		String[] old = {"1", "2", "3"};
		String[] newArray = new String[5];

		newArray  = old;
		
		for(String num : newArray) System.out.print(num+", ");
			System.out.println();
			System.out.println();	
		
			old[0] = "100";	//old의 0번객체(주소안의)의 값을을 바꿧어
			
		for(String num : newArray) System.out.print(num+", ");
			System.out.println();	
			System.out.println();
			
		for(String num : old) System.out.print(num+", "); 
			System.out.println();

	}

}//p 169  얕은복사를 의미한다 올드 100을 바꿧는데 뉴의 출력도 100으로 바뀌엇다
