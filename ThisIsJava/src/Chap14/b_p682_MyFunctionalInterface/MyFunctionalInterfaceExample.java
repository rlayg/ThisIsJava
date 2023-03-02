package Chap14.b_p682_MyFunctionalInterface;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		//이것이 자바다 p682 매개 변수가 있는 람다식
	
	MyFunctionalInterface fi;
	
	fi = (x) ->{
		int result = x*5;
		System.out.println(result);
	};
	fi.method(5);
	
	fi = (x) -> {System.out.println(x*5);
	};
	fi.method(2);
	
	fi = x -> System.out.println(x*5);
	fi.method(3);
	
	
	}
}
