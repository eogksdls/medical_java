package p0618;

import java.util.Arrays;

public class C0618_06 {
	public static void main(String[] args) {
		
		// int 배열 10개를 선언해서 1,3,5,7,9,.., 10개 입력해서 출력하시오
		int[] score = new int[10];
		for (int i=0;i<score.length;i++) {
			score[i] = 2*i + 1;
		}
		System.out.println("배열 : "+Arrays.toString(score));
		
//		// **배열선언 - 주소는 0부터 시작 
//		int[] score = new int[5];
//		// 초기화
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		// **배열선언과 동시에 초기화
//		int[] sc = {1,2,3,4,5};
//		// **배열선언 - 초기화
//		// 길이를 정하지 않고 입력한 개수만큼 장소가 생김
//		int[] sc2 = new int[] {1,2,3,4,5}; 
//		
//		// 배열선언 - 초기화
//		int[] s = new int[5];
//		for(int i=0;i<5;i++) {
//			s[i] = i+1;
		
	}
}
