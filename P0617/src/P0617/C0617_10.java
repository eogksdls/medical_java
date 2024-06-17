package P0617;

import java.util.Scanner;

public class C0617_10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("프로그램을 종료할까요?(종료:x)");
		String str = scan.next();
	
//		if(str.equals("x") || str.equals("X")) {
		if(str.equalsIgnoreCase("x")) {  // 대소문자 구분 안하고
			System.out.println("프로그램을 종료합니다.");
		}else {
			System.out.println("프로그램을 계속 실행합니다.");
		}
		
		
//		// String str = null;
//		String str = "";
//		if (str != null || !str.equals(""))
//			str.charAt(0);  // if문 뒤 한 줄일 경우는 {}를 쓰지 않아도 된다.
//		else
//			System.out.println("빈문자입니다.");
	}
}
