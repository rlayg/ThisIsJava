package Chap14.d_p686_MyFuntionalInterface;

public class UsingThisExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p686
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();

	}

}