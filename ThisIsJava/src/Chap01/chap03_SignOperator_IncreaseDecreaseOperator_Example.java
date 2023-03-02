package Chap01;

public class chap03_SignOperator_IncreaseDecreaseOperator_Example {

	public static void main(String[] args) {
		// 이것이 자바다 p.69 p.71 응용
		int a = 10;
		int b = -10;
		int c;
		System.out.println("------------");
		a++;
		++b;
		System.out.println("a= " + a); //11
		System.out.println("b= " + b); //-9
		
		System.out.println("------------");
		c= a++;
		System.out.println("c= " + c); //11
		System.out.println("a= " + a); //12
		
		System.out.println("------------");
		c= ++a;
		System.out.println("c= " + c); //13
		System.out.println("a= " + a); //13
		
		System.out.println("------------");
		c = a++ + ++b;
		System.out.println("c= " + c); //5
	}

}
