package P0617;

import java.util.Scanner;

public class C0617_11 {
	public static void main(String[] args) {
		// 점수를 입력받아, 90점 이상 A->B->C->D->F를 출력할수 있게 구현하시오
		// 90~92점 A-, 97~100 A+, 80~82점 B-...
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >> ");
		int a = scan.nextInt();
		String score = "";
		if (a>=90) {
			score = "A";
			if (a>=97) score = score+"+";
			else if (a>=92) score = score+"-";
		}else if (a>=80) {
			score = "B";
			if (a>=87) score = score+"+";
			else if (a>=82) score = score+"-";
		}else if (a>=70) {
			score = "C";
			if (a>=77) score = score+"+";
			else if (a>=72) score = score+"-";
		}else if (a>=60) {
			score = "D";
			if (a>=67) score = score+"+";
			else if (a>=62) score = score+"-";
		}else {
			System.out.println("F학점");
		}
		
		System.out.println("학점 : "+score);
	}
}
