package Chap12.f_p587_ThreadNameExample;

import Chap12.b_p602_SleepYieldJoinExample.ThreadB;

public class ThreadNameExample {

	public static void main(String[] args) {
		// 이것이 자바다 p587
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: "+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: "+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: "+threadB.getName());
		threadB.start();

	}

}
