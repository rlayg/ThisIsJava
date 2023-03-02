package Chap14.n_p716_ConstructorReferenceExample;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		// 이것이 자바다 p716
		
		Function<String, Member> function1 = Member :: new;
		//생성자 참조
		Member member1 = function1.apply("angel");
		//매개값 한개
		
		BiFunction<String, String, Member> function2 = Member :: new;
		//생성자 참조
		Member member2 = function2.apply("신천사", "angel");
		//매개값 2개

	}

}
