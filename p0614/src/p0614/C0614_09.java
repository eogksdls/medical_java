package p0614;

import java.util.Scanner;

public class C0614_09 {

	public static void main(String[] args) {
		int sca = 0;
		Scanner scan = new Scanner(System.in);
		
		// 두 숫자를 입력받아, 덧셈,뺄셈,곱셈,나눗셈을 출력하시오.
		System.out.println("[ 사칙 연산 프로그램 ]");
		
		System.out.println("첫 번째 숫자를 입력하세요."); // 웹상에선 모두 문자열 상태
		String num = scan.nextLine(); // 입력한 전체 문자를 받아오기
//		String num = scan.nextInt(); // 입력받은 정수를 숫자로 받아오기
		System.out.println("두 번째 숫자를 입력하세요.");
		String num2 = scan.nextLine();
		
		int number = Integer.parseInt(num);  // string num을 Int number로 형변환
		int number2 = Integer.parseInt(num2);
		
		
		System.out.println("덧셈 : "+(number+number2));
		System.out.println("뺄셈 : "+(number-number2));
		System.out.println("곱셈 : "+(number*number2));
		System.out.println("나눗셈 : "+(number/number2));
		

	}

}
