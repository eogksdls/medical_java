package P0617;

import java.util.Scanner;

public class C0617_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 2개의 문자열을 입력받아
		// 숫자이면 정수타입으로 변경해서 두 수를 더하는 프로그램을 구현하시오
		
		System.out.println("데이터를 입력하세요1 >>");
		String str = scan.next();
		char ch = str.charAt(0); // charAt() : 문자열을 문자로 변환
		
		System.out.println("데이터를 입력하세요2 >>");
		String str2 = scan.next();
		char ch2 = str2.charAt(0); // charAt() : 문자열을 문자로 변환
		
		if ((ch>='0' && ch <='9') && (ch2>='0' && ch2<='9')) {
			int num = ch - '0';  // 문자숫자를 정수형으로 변경하는 방법
			
			int num2 = ch2 - '0';
			System.out.println("합 : "+(num+num2));
		}else {
			System.out.println(" %c %s %d");
		}
	}
}
