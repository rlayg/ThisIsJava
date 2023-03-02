package Chap14.d_p686_MyFuntionalInterface;

public class UsingThisExample {

	public static void main(String[] args) {
		// 이것이 자바다 p686
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();

	}

}