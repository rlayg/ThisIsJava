package Chap15.g_p753_TreeSetExample;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p753
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(Integer.valueOf(87));
		scores.add(new Integer(98));
		scores.add(Integer.valueOf(98));
		scores.add(new Integer(75));
		scores.add(75);
		scores.add(new Integer(95));
		scores.add(95);
		scores.add(new Integer(80));
		scores.add(80);
		//deprecated
		
		
		Integer score = null;
		
		score = scores.first();
//		System.out.println("���� ���� ����: "+ score);
		System.out.printf("���� ���� ����: %d\n", score);
		
		score = scores.last();
//		System.out.println("���� ���� ����: "+ score+"\n");
		System.out.printf("���� ���� ����: %d\n\n", score);
		
		score = scores.lower(Integer.valueOf(95));
//		System.out.println("95�� �Ʒ� ����: " + score);
		System.out.printf("95�� �Ʒ� ����: %d\n", score);
		
		score = scores.higher(95);
		System.out.println("95�� ���� ����: " + score + "\n");
		
		score = scores.floor(Integer.valueOf(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: "+score);
		
		score = scores.ceiling(85);
		System.out.println("85�� �̰ų� �ٷ� ���� ����: " + score +"\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
//			System.out.println(score + "(���� ��ü ��: " + scores.size() + ")");
			System.out.printf("%d (���� ��ü ��: %d)\n", score, scores.size());
		}

	}

}
