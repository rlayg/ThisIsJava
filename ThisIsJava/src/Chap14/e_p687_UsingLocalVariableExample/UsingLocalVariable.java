package Chap14.e_p687_UsingLocalVariableExample;

public class UsingLocalVariable {
	void method(int arg) { //arg는 final 특성을 가짐
		int localVar = 40; // localVar 는 final 특성을 가짐
		
		//arg = 31;        final 특성 때문에 수정 불가
		//locaVar = 41;    final 특성 때문에 수정 불가
		
		//람다식
		
		MyFuntionalInterface fi = () ->{
			//로컬 변수로 읽기
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}
