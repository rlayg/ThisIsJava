package Chap12.f_p587_ThreadNameExample;

import Chap12.b_p602_SleepYieldJoinExample.ThreadB;

public class ThreadNameExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p587
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: "+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�: "+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�: "+threadB.getName());
		threadB.start();

	}

}
