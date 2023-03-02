package Chap15.g_p753_TreeSetExample;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// 이것이 자바다 p753
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
//		System.out.println("가장 낮은 점수: "+ score);
		System.out.printf("가장 낮은 점수: %d\n", score);
		
		score = scores.last();
//		System.out.println("가장 높은 점수: "+ score+"\n");
		System.out.printf("가장 높은 점수: %d\n\n", score);
		
		score = scores.lower(Integer.valueOf(95));
//		System.out.println("95점 아래 점수: " + score);
		System.out.printf("95점 아래 점수: %d\n", score);
		
		score = scores.higher(95);
		System.out.println("95점 위의 점수: " + score + "\n");
		
		score = scores.floor(Integer.valueOf(95));
		System.out.println("95점 이거나 바로 아래 점수: "+score);
		
		score = scores.ceiling(85);
		System.out.println("85점 이거나 바로 위의 점수: " + score +"\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
//			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
			System.out.printf("%d (남은 객체 수: %d)\n", score, scores.size());
		}

	}

}
