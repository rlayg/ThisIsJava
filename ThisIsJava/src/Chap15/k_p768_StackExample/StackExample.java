package Chap15.k_p768_StackExample;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p769
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) { //�������̽��� ������� Ȯ��
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : " + coin.getValue()+"��");
		}//���Լ����̴ϱ� �������� �����ͺ��� ����
		

	}

}
