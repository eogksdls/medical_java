package p0618;

import java.util.Scanner;

public class C0618_03 {
	public static void main(String[] args) {
		
		//입력한 숫자를 출력하고, x,X를 입력하면 종료되도록 구현
		Scanner scan = new Scanner(System.in);
		// 프로그램이 종료가 될 때, 입력한 숫자의 합을 출력해주세요
		
		int sum = 0;
		while(true) {
			System.out.println("숫자를 입력하세요.(종료:x) >>");
			String input = scan.nextLine();
			
			if (input.equalsIgnoreCase("x")) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("총 합계 : "+sum);
				break;
			}
			System.out.println("입력한 숫자 : "+input);
			sum += Integer.parseInt(input);
		}
		

//		int i = 10;
//		while(i>=0) {
//			System.out.println(i);
//			i--;
//		}
		
//		for (int i=10;i>=0;i--) {
//			System.out.println(i);
//		}
//		
//		int i = 0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		//     (초기화;조건식;증감식)
//		for (int i=0;i<10;i++) {
//			System.out.println(i);
//		}
	}
}
