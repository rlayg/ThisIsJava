package Chap07.i_just;

public class i_PersonRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i_Person 객체를 생성
		//세터를 써서 weight를 70으로 입력하고
		//게터를 써서 키를 출력
		//게터를 써서 weight를 출력
		
		i_Person person = new i_Person("김두한",50,180,80);
		person.show();
		
		person.setAge(30);
		System.out.println("김두한의역행: "+person.getAge());

		person.setHeight(70);
		System.out.println("김두한의키변화: "+person.getHeight());
		person.setWeight(70);
		System.out.println("김두한무게출력: "+person.getWeight());
	}

}
