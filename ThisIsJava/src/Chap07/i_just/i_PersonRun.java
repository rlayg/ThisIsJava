package Chap07.i_just;

public class i_PersonRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i_Person ��ü�� ����
		//���͸� �Ἥ weight�� 70���� �Է��ϰ�
		//���͸� �Ἥ Ű�� ���
		//���͸� �Ἥ weight�� ���
		
		i_Person person = new i_Person("�����",50,180,80);
		person.show();
		
		person.setAge(30);
		System.out.println("������ǿ���: "+person.getAge());

		person.setHeight(70);
		System.out.println("�������Ű��ȭ: "+person.getHeight());
		person.setWeight(70);
		System.out.println("����ѹ������: "+person.getWeight());
	}

}
