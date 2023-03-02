package Chap01;

public class ConditionOperationExamole {

	public static void main(String[] args) {
		// 이것이 자바다 p.101
		int score = 80;
		char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다.");
		
	}

}
