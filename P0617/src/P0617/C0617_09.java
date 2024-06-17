package P0617;

import java.util.Scanner;

public class C0617_09 {
	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요 >>");
		int a = scan.nextInt();
		if(a>=90) {
			System.out.println("A학점");
		}else if (a>=80) {
			System.out.println("B학점");
		}else if (a>=70) {
			System.out.println("C학점");
		}else if (a>=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
	}
}
