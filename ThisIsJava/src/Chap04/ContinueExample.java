package Chap04;

public class ContinueExample {

	public static void main(String[] args) {
		// 이것이 자바다 p. 132
		for (int i = 1; i<11; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i);
			
	
		}
		System.out.println("=============");
		int sum =0;
		for (int a = 1; a<11; a++){
			if(a%2 ==1 ) continue; //{continue;} 이것도 됨
			sum+=a;

		System.out.println(sum);
			//선생님예제
		}
		System.out.println("=============");
		for(int i = 1; i<=10; i++) {
			if(i%2 !=0) {
				continue;
			}
			System.out.println(i); // 책예제
		}

	}

}
