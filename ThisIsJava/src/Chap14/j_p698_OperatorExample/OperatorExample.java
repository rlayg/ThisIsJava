package Chap14.j_p698_OperatorExample;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	private static int[] scores = {92, 95, 87};
	
	public static int maxOrMin( IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 이것이 자바다 p698
		//최대값 얻기
		int max = maxOrMin(
				(a, b)-> {if(a>=b) return a;
				else return b;
				}) ;
		System.out.println("최대값: "+ max);
		
		//최소갑 얻기
		int min = maxOrMin(
				(a, b) -> {
					if(a<=b) return a;
					else return b;
				});
		System.out.println("최소값: "+min);
				
		

	}

}
