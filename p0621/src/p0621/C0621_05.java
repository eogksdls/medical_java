package p0621;

import java.util.Scanner;

public class C0621_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//입력한 두 수의 합,차,곱,분 계산결과값을 출력하시오.
		System.out.print("숫자를 입력하세요. >> ");
		int a = scan.nextInt();
		System.out.print("숫자를 입력하세요. >> ");
		int b = scan.nextInt();
		
		C0621_05 c = new C0621_05();
//		Cal2 c = new Cal2();
		int a1 = c.plus(a,b);
		int a2 = c.minus(a,b);
		int a3 = c.multi(a,b);
		double a4 = c.divide(a,b);
		
		System.out.println("[ 사칙연산 결과 ]");
		System.out.println("---------------------------------------");
		System.out.printf("더하기 : %d\n빼기 : %d\n곱하기 : %d\n나누기 : %.2f\n",a1,a2,a3,a4);
		
		
		
	}
	// 메소드 선언
	int plus(int a, int b) {
		return a + b;
	}
	
	int minus(int a, int b) {
		return a - b;
	}
	
	int multi(int a, int b) {
		return a * b;
	}
	
	double divide(double a, double b) {
		return a / b;
	}
	
}
