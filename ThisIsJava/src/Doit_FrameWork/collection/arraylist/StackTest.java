package Doit_FrameWork.collection.arraylist;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		
		return arrayStack.remove(len -1);
		
	}
	/*
	맨 위에 있는거 한번 꺼내보는거 위와 거의 동일한데
	여긴 remover가 아니라 get이다 그리고 peek은 없어지지 않음
	*/
	public String peek() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다");
			return null;
		}
		
		return arrayStack.get(arrayStack.size()-1);
	}
	
}

public class StackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());

		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
