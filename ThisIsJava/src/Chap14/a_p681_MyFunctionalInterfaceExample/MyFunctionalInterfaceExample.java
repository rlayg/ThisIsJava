package Chap14.a_p681_MyFunctionalInterfaceExample;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		// 이것이 자바다 p681 매개 변수와 리턴값이 없는 람다식
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
