package Chap14.n_p716_ConstructorReferenceExample;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p716
		
		Function<String, Member> function1 = Member :: new;
		//������ ����
		Member member1 = function1.apply("angel");
		//�Ű��� �Ѱ�
		
		BiFunction<String, String, Member> function2 = Member :: new;
		//������ ����
		Member member2 = function2.apply("��õ��", "angel");
		//�Ű��� 2��

	}

}
