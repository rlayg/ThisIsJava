package Chap14.b_p682_MyFunctionalInterface;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		//�̰��� �ڹٴ� p682 �Ű� ������ �ִ� ���ٽ�
	
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
