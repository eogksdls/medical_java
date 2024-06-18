package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 번호 생성
		// 1-45 사이의 숫자 -> 6개 뽑기
		
		// 1. 1-45사이 배열 만들기
		int[] ball = new int[45];
		for (int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		// 2. 배열 랜덤으로 섞기
		int no = 0;
		int temp = 0; // 중간 값 저장해주고 값 전달 역할
		for (int i=0;i<=300;i++) {
			no = (int)(Math.random()*45); //0-44까지 주소값
			temp = ball[0];
			ball[0] = ball[no];
			ball[no] = temp;
		}
		
		// 4. 로또 번호 출력
		System.out.print("행운의 번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		
		// 3. 나의 행운의 숫자 배열(1-45사이 숫자 6개)
		int[] mynum = new int[6];
		int num = 0;
		int cnt = 0;
		while (cnt<6) {
			System.out.printf("%d번째 숫자를 입력하세요.(1-45사이의 숫자) >> ",cnt+1);
			num = scan.nextInt();
			if (num<1 || num>45) {
				System.out.println("1-45까지의 숫자만 입력하셔야 합니다. 다시 입력해주세요.");
				continue;
			}
			mynum[cnt] = num;
			cnt++;
		}
		
		// 5. 나의 숫자 출력
		System.out.print("나의 행운의 번호 : ");
		for (int i=0;i<mynum.length;i++) {
			System.out.print(mynum[i]+" ");
		}
		System.out.println();
		
		// 6. 맞춘 개수, 맞춘 번호 확인하기 - mynum, ball
		int count = 0;
		int[] chk = new int[6];
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (mynum[i]==ball[j]) {
					chk[count] = mynum[i];
					count++;
					break;   // 숫자 맞으면 j for 문 빠져나오기
				}
			}
		}
		
		switch(count) {
		case 0:
			System.out.println("맞춘 개수 : 없음");
			break;
		default:
			System.out.println("맞춘 개수 : "+count);
			System.out.print("맞춘 번호: ");
			for (int i=0;i<count;i++) {
				System.out.print(chk[i]+" ");
			}
			System.out.println();
			break;
		}
		
		// 7. 당첨금 수령 : switch 사용!
		switch(count) {
		case 6:
			System.out.println("1등 입니다!");
			System.out.printf("당첨금 : %s 원","100억");
			break;
		case 5:
			System.out.println("2등 입니다!");
			System.out.printf("당첨금 : %s 원","1억");
			break;
		case 4:
			System.out.println("3등 입니다!");
			System.out.printf("당첨금 : %s 원","1백만");
			break;
		case 3:
			System.out.println("4등 입니다!");
			System.out.printf("당첨금 : %s 원","1만");
			break;
		
		default:
			System.out.println("낙첨 입니다.");
			break;
		}
		
	}
}
