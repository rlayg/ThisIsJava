package Chap14.e_p687_UsingLocalVariableExample;

public class UsingLocalVariable {
	void method(int arg) { //arg�� final Ư���� ����
		int localVar = 40; // localVar �� final Ư���� ����
		
		//arg = 31;        final Ư�� ������ ���� �Ұ�
		//locaVar = 41;    final Ư�� ������ ���� �Ұ�
		
		//���ٽ�
		
		MyFuntionalInterface fi = () ->{
			//���� ������ �б�
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}
