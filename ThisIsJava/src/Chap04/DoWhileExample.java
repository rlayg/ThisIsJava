package Chap04;

import java.util.Scanner;


public class DoWhileExample {

	public static void main(String[] args) {
		// �̰��� �ڹٴ� p130
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q"));
		//! - q�� �ƴ϶�� do ���ϸ� ����
		// q��� �ؿ� ���α׷� ����
		
		System.out.println();
		System.out.println("���α׷� ����");
		}

	}


