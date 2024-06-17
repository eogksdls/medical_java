package P0617;

import java.util.Scanner;

public class C0617_14 {
	public static void main(String[] args) {
		
		// 1부터 10까지 랜덤숫자를 생성해서
		// 숫자 1개를 입력받아
		// 같은 당첨, 다르면 꽝 이라고 출력하시오
		Scanner scan = new Scanner(System.in);
		int n1 = (int)(Math.random()*10)+1;
		
		System.out.println("숫자 하나를 입력하세요>>");
		int input = scan.nextInt();
		
		if (n1==input) {
			System.out.println("당첨입니다.");
		}else {
			System.out.println("꽝입니다.");
		}
			
		
		
////		Math.random(); // 0.0 <= x && x < 1.0
//		System.out.println(Math.random()); // 소숫점 15번째자리까지 출력
//		
//		// 1부터 100까지의 숫자를 랜덤으로 생성해서 출력하시오.
//		int num = (int)(Math.random()*100)+1;
//		System.out.println(num);
//		
//		// 1부터 3까지 랜점숫자 생성 후 추력
//		int num1 = (int)(Math.random()*3)+1;
//		System.out.println(num1);
//		
//		// 1부터 45까지 랜점숫자 생성 후 추력
//		int num2 = (int)(Math.random()*45)+1;
//		System.out.println(num2);
		
//		// 1-10까지의 랜덤숫자를 출력
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
//		
//		// 0-9싸지
//		int n = (int)(Math.random()*10);
//		
//		// 0-10까지
//		int n1 = (int)(Math.random()*11);
//		
//		// 2-10까지
//		int n2 = (int)(Math.random()*9)+2;
//		
//		// 1-100까지의 랜덤숫자 출력
//		int num2 = (int)(Math.random()*100)+1;
//		System.out.println(num2);
//		
//		// 0-4까지 출력
//		int num3 = (int)(Math.random()*5);
//		System.out.println(num3);
//		
//		// 0-19까지 출력
//		int num4 = (int)(Math.random()*20);
//		System.out.println(num4);
//		
	}
}
