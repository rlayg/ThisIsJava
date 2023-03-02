package Chap04;

import java.util.Scanner;


public class DoWhileExample {

	public static void main(String[] args) {
		// 이것이 자바다 p130
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q"));
		//! - q가 아니라면 do 이하를 실행
		// q라면 밑에 프로그램 종료
		
		System.out.println();
		System.out.println("프로그램 종료");
		}

	}


