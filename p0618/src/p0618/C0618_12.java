package p0618;

import java.util.Scanner;

public class C0618_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 3,3 홍길동, 유관순, 이순신 성적을 입력받아 출력하시오
		// 국어,영어,수학
		String[] title = {"이름","국어","영어","수학"};
		String[] name = new String[3];
		int[][] score = new int[3][3];
		
		
		// 학생성적 입력
		for (int i=0;i<score.length;i++) {
			System.out.println(title[0]+"을 입력하세요.");
			name[i] = scan.next();
			for (int j=0;j<score[i].length;j++) {
				System.out.print(title[j+1]+"점수를 입력하세요>>");
				score[i][j] = scan.nextInt();
			}
		}
		
		// 학생성적 출력
		System.out.println("[ 학생 성적 출력 ]");
		for (int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		for (int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for (int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
