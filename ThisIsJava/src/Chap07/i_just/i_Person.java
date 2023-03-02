package Chap07.i_just;

public class i_Person {
			//그냥 강사가 하는거 p.268
	private String name;
	private int age;
	private int height;
	private int weight;
	
	//게터세터
	//게터
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	//세터
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//생성자를 만들어주세요
	//p. 212
//	i_Person person = new i_Person();
	
	public i_Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//메소드 만들기 show() 이름 나이 키 몸무게를 출력하는 메소드

	
	public void show() {
		
		
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("키: "+this.height);
		System.out.println("몸무게: "+this.weight);
		
	}
	
	
	
	
}
