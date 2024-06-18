package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 로또 번호 당첨
		// 45개의 ball 배열을 생성하여
		// 1-45까지 숫자를 입력하고
		// 1-45까지 6개의 숫자를 입력받아 출력하시오.
//		int[] ball = new int[6];
//		for (int i=0;i<ball.length;i++) {
//			ball[i] = (int) (Math.random()*45)+1; // 번호가 중복될 위험
//		}
		
		// 1. 1-45 숫자 배열 생성
		int[] ball = new int[45];
		for (int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		// 2. 랜덤으로 섞기(중복 방지)
		int no = 0; // 랜덤 번호
		int t_value = 0; // 값을 저장하여 전달해주는 역할
		
		for (int i=0;i<=300;i++) {
			no = (int)(Math.random()*45); //0-44
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}
		
		// 3. 나의 행운의 숫자 고르기
		int[] myArray = new int[6];
		for (int i=0;i<myArray.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.(1-45사이 숫자) \n",i+1);
			myArray[i] = scan.nextInt();
		}
		System.out.print("나의 숫자 : ");
		for (int i=0;i<6;i++) {
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		
		// 4. 로또 번호 출력
		System.out.print("행운의 번호 : ");
		for (int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		
//----------------------------------------------------------------------
//		// 10개짜리 배열을 생성하고 숫자를 입력받아, 3,4번째 숫자만 출력하시오!
//		int[] arr = new int[10];
//		for (int i=0;i<arr.length;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요");
//			int input = scan.nextInt();
//			arr[i] = input;
//		}
//		System.out.printf("3번째, 4번째 숫자 : %d, %d \n",arr[2],arr[3]);
	}
}
