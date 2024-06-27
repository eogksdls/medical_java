package p0624;

import java.util.Scanner;

public class Calculate {

	static Scanner scan = new Scanner(System.in);
	// 메소드 1개를 사용해서 처리하는 방법
	static String[] title = {"국어","영어","수학"};
	
	void change(int[] score) {
	
		for (int i=0;i<title.length;i++) {
			System.out.printf("현재 %s점수 : %d \n",title[i],score[i]);
			
			System.out.printf("변경할 %s 점수를 입력하세요. >> ",title[i]);
			score[i] = scan.nextInt();
			System.out.printf("변경된 %s점수 : %d \n",title[i],score[i]);
			System.out.println();
		}
	}

}
