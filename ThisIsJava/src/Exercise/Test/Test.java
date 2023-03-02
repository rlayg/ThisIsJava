package Exercise.Test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//for 1~10
//		for(int i = 1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		//for 문에서 if써서 짝수만 출력
//		for(int i =1; i<=10; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		//while 1~10까지 출력
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		//while 사용 싹수만 출력 continue 사용
//		int i = 0;
//		while(i<=10) {
//			i++;
//			if(i%2==1) {
//			continue;
//			}
//			System.out.println(i);
//		}
		
		//for문을 사용 짝수들의 합
//		int sum = 0;
//		for(int i = 1; i<=10; i++)
//			if(i%2==0) {
//				sum +=i;
//			}
//		System.out.println(sum);
		
		//while과 continue를 사용 짝수들의 합
//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			i++;
//			if(i%2==1) {
//				continue;
//			}else {
//			sum += i;
//			}
//		}
//		System.out.println(sum);
		
		//Math.random()으로 1부터 6사이의 점수를 while문을 써서 3개 출력
//		int i=1;
//		while(i<=3) {
//			i++;
//			System.out.println(((int)(Math.random()*6)+1));
//			
//		} 
		
		//scanner 로 문자열을 입력받아서
		//"안녕하세요"를 콘솔에 출력
		
//		System.out.println("문자열을 입력해 주세요");
//		Scanner sc = new Scanner(System.in);
//		System.out.println(sc.nextLine()); 
		//이후 콘솔창에 안녕하세요 입력
		//import도 해야함
		
		//Scanner로 두 숫자를 입력하여 합을 출력해 봅시다
		
//		System.out.println("숫자를 입력해 주세요");
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		System.out.println(x+y);
//		// 1 2 이렇게 쳐도 되고 1 치고 2 쳐도 됨
		
//		
//		//nextLine으로 한다면? 스트링으로 출력되니까
//		System.out.println("숫자를 입력해 주세요");
//		Scanner sc = new Scanner(System.in);
//		String x = sc.nextLine();
//		int x1 = Integer.parseInt(x);
//		int y = sc.nextInt();
//		System.out.println(x+y);
//		// 1 2 이렇게 쳐도 되고 1 치고 2 쳐도 됨
//		이거 뭔가 값이 이상하게 나옴
		
//		숫자를 입력받아서, if else 10대입니다 20대입니다 ~40대입니다 까지 출력
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력해주세요");
//		int i = sc.nextInt();
//		if(i>=40) {
//			System.out.println("40대입니다");
//		} else if(i>=30) {
//			System.out.println("30대입니다");
//		} else if(i>=20) {
//			System.out.println("20대입니다");
//		} else	{
//			System.out.println("10대입니다");
//		}
		
		
		//위와 같은거 switch case로
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력해주세요");
//		int i = sc.nextInt();
//		int num = i/10;
//		switch(num) {
//			case 1:
//				System.out.println("10대입니다");
//				break;
//			case 2:
//				System.out.println("20대입니다");
//				break;
//			case 3:
//				System.out.println("30대입니다");
//				break;
//			case 4:
//				System.out.println("40대입니다");	
//				break;
//			default:
//				System.out.println("기타");
//				break;
//		}
		
//		Scanner sc = new Scanner(
//				System.in
//				);
//						int v1 = sc.nextInt();
//						int age = v1 / 10;
//						switch (age) {
//						case 1:
//						case 2:
//						case 3:
//						case 4:
//						case 5:
//						case 6:
//						case 7:
//						case 8:
//						case 9:
//						case 10:
//							System.out.println(age*10 + "대 입니다.");
//							break;
//						default:
//							System.out.println("올바른 숫자를 입력해주세요");
//							break;
//						} 
		
		
		//whie,continue문에서 1부터 입력받은 수까지 사이에 있는 모든 3의 배수의 합?
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요");
//		int number = sc.nextInt();
//		int sum = 0;
//		int i = 0;
//		while( i <= number) {
////			i++여기 넣는다면떄 여기서 + 안되고 밑에 넘어가면 +됨
////			그래서 5넣어도 3의배수로 안되고 밑에서 6으로 인식
//		if(i%3!=0) {
//			i++;
//			continue;
//		} 
//			sum += i;
//			i++;
//		
//		}
//		System.out.println(sum);
//		
		
	}

}



