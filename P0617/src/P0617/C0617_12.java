package P0617;

import java.util.Scanner;

public class C0617_12 {
	public static void main(String[] args) {
		// if.switch
		// 두 수를 입력받아, 사칙연산 프로그램 구현
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. ");
		int n = scan.nextInt();
		System.out.println("숫자를 입력하세요. ");
		int n2 = scan.nextInt();
		
		System.out.println("1. 더하기(+) 2. 빼기(-) 3. 곱하기(*) 4. 나누기(/) ");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		
		switch(choice) {
			case 1 :
				System.out.println("더하기 : "+(n+n2));
				break;
			case 2 :
				System.out.println("빼기 : "+(n-n2));
				break;
				
			case 3 :
				System.out.println("곱하기 : "+(n*n2));
				break;
				
			case 4 :
				System.out.println("나누기 : "+(n/n2));
				break;
				
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
	}
			
				
	}
}
