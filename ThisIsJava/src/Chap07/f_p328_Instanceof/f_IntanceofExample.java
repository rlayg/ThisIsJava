package Chap07.f_p328_Instanceof;

public class f_IntanceofExample {

		// �̰��� �ڹٴ� p.328
		public static void method1(f_Parent parent) {
			if(parent instanceof f_Child) {   //f_Child Ÿ������ ��ȯ �������� Ȯ��
				f_Child child = (f_Child) parent;
			System.out.println("method1 - f_Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - f_Child�� ��ȯ���� ����");
		}
	}
	public static void method2(f_Parent parent) {
		f_Child child = (f_Child) parent;
		System.out.println("method2 - f_Child�� ��ȯ����");
	}
		
		
		public static void main(String[] args) {
			
			f_Parent parentA = new f_Child();
			method1(parentA);
			method2(parentA);
			
			f_Parent parentB = new f_Parent();
			method1(parentB);
			method2(parentB); //���ܹ߻�
	}

}
