package Chap14.a_p681_MyFunctionalInterfaceExample;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p681 �Ű� ������ ���ϰ��� ���� ���ٽ�
		MyFunctionalInterface fi;
		
		fi = () ->{
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
		
	}

}
