package p0621;

import java.util.Scanner;

public class C0621_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 10;
		int b = 5;
		
		C0621_04 c = new C0621_04(); // 객체선언
		int r1 = C0621_04.plus(a,b); // 메소드 plus는 static :  클래스명.메소드명()으로 호출
		System.out.println(r1);
		
		int r2 = c.minus(a,b);
		System.out.println(r2);
		
		int r3 = c.multi(a,b);
		System.out.println(r3);
		
		int r4 = c.divide(a,b);
		System.out.println(r4);
		
		
	}
	
	static int plus(int a, int b) {
		return a+b;
	}
	
	int minus(int a, int b) {
		return a-b;
	}
	
	int multi(int a, int b) {
		return a*b;
		
	}
	
	int divide(int a, int b) {
		return a/b;
	}
	
	
}

