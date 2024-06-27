package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		// 두 개의 수와 1개의 사칙연산 +,-,*,/을
		// 입력받아 결과값을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] arr = new int[2];
		for (int i=0;i<arr.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.>> ",(i+1));
			arr[i] = scan.nextInt();
		}
		System.out.print("사칙연산을 입력하세요.>> ");
		String str = scan.next();
		
		Calculate2 c = new Calculate2();
		int result = c.cal(arr, str);
		System.out.println("사칙연산 값 : "+result);
		
//		System.out.print("숫자를 입력하세요. >> ");
//		int x = scan.nextInt();
//		System.out.print("숫자를 입력하세요. >> ");
//		int x2 = scan.nextInt();
//		System.out.print("사칙연산을 입력하세요. >> ");
//		String str  = scan.next();
//		
//		Calculate c = new Calculate(); // 객체선언
//
//		int result = c.cal(x, x2, str);
//		System.out.println("사칙연산 값 : "+result);
		
		
//		// 10,5,+ => 결과값이 15
//		int result  = 0;
//		if (cal.equals("+")) {
//			result = x + x2;
//		}else if (cal.equals("-")) {
//			result = x - x2;
//		}else if (cal.equals("*")) {
//			result = x * x2;
//		}else if (cal.equals("/")) {
//			result = x / x2;
//		}else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
//		
//		
	}
}
