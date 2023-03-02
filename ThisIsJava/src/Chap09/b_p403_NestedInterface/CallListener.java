package Chap09.b_p403_NestedInterface;

public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");		
	}

}
