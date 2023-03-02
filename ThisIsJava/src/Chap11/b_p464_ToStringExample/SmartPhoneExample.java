package Chap11.b_p464_ToStringExample;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// 이것이 자바다 p 465
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);

	}

}
