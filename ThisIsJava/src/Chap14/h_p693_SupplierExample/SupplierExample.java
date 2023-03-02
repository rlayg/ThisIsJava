package Chap14.h_p693_SupplierExample;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		// 이것이 자바다 p693
		IntSupplier intSupplier = () -> {
			int num = (int)	(Math.random()*6)+1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수: "+ num);

	}

}
