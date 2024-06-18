package p0618;

import java.util.Scanner;

public class C0618_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// if 문으로 변경
		 System.out.println("주민번호를 입력하세요 >>");
		 String input = scan.nextLine();
		 String flag = input.substring(7,8);
		 String birthY = input.substring(0,2);
		 
		 int age = 0;
		 if (flag.equals("1") | flag.equals("2")) {
			 age = 2024 - Integer.parseInt("19"+birthY) + 1;
			 System.out.println("당신의 나이는 "+age+"입니다.");
		 }else if (flag.equals("3") | flag.equals("4")) {
			 age = 2024 - Integer.parseInt("20"+birthY) + 1;
			 System.out.println("당신의 나이는 "+age+"입니다.");
		 }else {
			 System.out.println("잘못 입력하셨습니다.");
		 }
	}
}
