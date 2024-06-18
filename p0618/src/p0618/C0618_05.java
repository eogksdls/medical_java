package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		// 5개의 숫자를 모두 입력받은 후, 모두 출력하시오
//		String total = "";
//		for (int i=1;i<=5;i++) {
//			System.out.println(i+"번째 숫자를 입력하세요");
//			String input = scan.next();
//			if (i<=4) total += input+", ";
//			else total += input;
//		}
//		System.out.println("입력한 숫자 : "+total);
		
		// 배열을 사용해서 출력해보자!
		int[] score = new int[5]; // 5개의 공간을 만들어주는 것
		for (int i=0;i<5;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			// 배열에 입력
			score[i] = scan.nextInt();
		}
//		System.out.println(score); // score 의 주소값이 출력됨
		System.out.println("입력한 숫자 : "+Arrays.toString(score));
	}
}
