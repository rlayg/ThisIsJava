package Chap16.b_p784_LambdaExpressionExample;

public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public void printInfo() {
		System.out.println(this.getName() + "-" + this.getScore());
	}
	public static int getScore2(Student student) {
		return student.score;
	}
}
