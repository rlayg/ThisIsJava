package Chap14.h_p693_SupplierExample;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p693
		IntSupplier intSupplier = () -> {
			int num = (int)	(Math.random()*6)+1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("���� ��: "+ num);

	}

}
