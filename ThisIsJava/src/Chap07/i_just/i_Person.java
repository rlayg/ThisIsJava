package Chap07.i_just;

public class i_Person {
			//�׳� ���簡 �ϴ°� p.268
	private String name;
	private int age;
	private int height;
	private int weight;
	
	//���ͼ���
	//����
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
	//����
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
	
	//�����ڸ� ������ּ���
	//p. 212
//	i_Person person = new i_Person();
	
	public i_Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//�޼ҵ� ����� show() �̸� ���� Ű �����Ը� ����ϴ� �޼ҵ�

	
	public void show() {
		
		
		System.out.println("�̸�: "+this.name);
		System.out.println("����: "+this.age);
		System.out.println("Ű: "+this.height);
		System.out.println("������: "+this.weight);
		
	}
	
	
	
	
}
