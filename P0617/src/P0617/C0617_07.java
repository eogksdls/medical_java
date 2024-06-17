package P0617;

import java.util.Scanner;

public class C0617_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요 >> ");
		String str = scan.nextLine(); // 입력한 모든 문자열을 가져옴(잘라오지 않음)
		System.out.println("입력한 문자의 길이 : "+str.length());
	}
}
