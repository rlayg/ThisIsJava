package Chap15.k_p768_StackExample;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		// 이것이 자바다 p769
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) { //코인케이스가 비었는지 확인
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue()+"원");
		}//후입선출이니까 마지막에 넣은것부터 뽑음
		

	}

}
