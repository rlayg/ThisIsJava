package Chap09.b_p403_NestedInterface;

public class ButtonExample {

	public static void main(String[] args) {
		// 이것이 자바다 p 402
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
