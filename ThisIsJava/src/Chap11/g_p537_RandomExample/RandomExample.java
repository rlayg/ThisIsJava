package Chap11.g_p537_RandomExample;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p.537 �ζǻ̱�
		
		//���ù�ȣ
		int[] selecNumber = new int[6];  // ���ù�ȣ 6�� ����� �迭 ����
		Random random = new Random(3);  // ���ù�ȣ ��� ���� ���� ��ü ���� 3�� ���� ����
		System.out.println("���� ��ȣ: ");
		for(int i = 0; i<6; i++) {
			selecNumber[i] = random.nextInt(45) +1; // ���� ��ȣ ��� �迭�� ���� nextint�� 0���� ������ ����-1���� ���
			System.out.print(selecNumber[i] + " ");
		}
		System.out.println();
		
		//��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random(1231); // ��÷��ȣ�� ��� ���� ������ü ����  ���� ����
		System.out.println("��÷ ��ȣ: ");
		for(int i = 0; i<6; i++) {
			winningNumber[i] = random.nextInt(45)+1 ;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println("");
		
		//��÷����
		Arrays.sort(selecNumber);
		Arrays.sort(winningNumber); // ���óѹ��� ��÷�ѹ� ���ϱ����� ���� sort�� ����
		boolean result = Arrays.equals(selecNumber, winningNumber);  // �迭 �׸� ���� ��
		System.out.print("��÷ ���� ");
		if(result) {
			System.out.println("1��");
		}else {
			System.out.println("��");
		}
		
		
	}

}
