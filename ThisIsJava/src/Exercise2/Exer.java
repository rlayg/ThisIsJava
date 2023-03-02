package Exercise2;

import java.util.Random;

public class Exer {
	public static void main(String[] args) {
		
//		int number =(int) (Math.random()*6+1);
//		
//		System.out.println(number);
//		
//		Random r = new Random();
//		int ran = r.nextInt(1,7);
//		System.out.println(ran);
//		
		
//		int[] arr = new int[] { 1, 2, 3 };
//
//		try {
//		for (int i = 0; i <=3; i++) {
//						System.out.println(arr[i]); 
//		}
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("어레이인덱스아우로브바운스");
//		}finally {System.out.println("여기까지");};
		
		Integer wrap = Integer.valueOf(100);
		Integer wrap1 = Integer.valueOf("100");
		Integer wrap2 = 100;
		
		System.out.println(wrap);
		System.out.println(wrap1);
		System.out.println(wrap2);
		
	}
}
