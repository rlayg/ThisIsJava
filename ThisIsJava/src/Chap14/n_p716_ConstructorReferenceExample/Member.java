package Chap14.n_p716_ConstructorReferenceExample;

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() ����");
	}
	public Member(String id) {
		System.out.println("Member(String) id ����");
		this.id = id;
	}
	public Member(String name, String id) {
		System.out.println("Member(String, String id)");
		this.name = name;
		this.id = id;
	}
	
	public String getId() {return id;}

}
