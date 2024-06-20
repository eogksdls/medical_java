package p0619;

import java.util.Scanner;

public class C0619_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 로또 프로그램을 구현
		// 1. 1-45의 숫자가 들어가 있는 배열 생성 -> 랜덤으로 섞어 그 중 6개를 가져오면 로또번호
		int[] ball = new int[45];
		for (int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		// 2. 랜덤으로 섞기
		int no = 0;
		int temp = 0;
		for (int i=0;i<=300;i++) {
			no = (int)(Math.random()*45); // no에 랜덤숫자 생성
			temp = ball[0];   // temp에 ball[0] 값 저장
			ball[0] = ball[no];
			ball[no] = temp;
		}
		System.out.print("로또 번호 : ");
		for (int i=0; i<6; i++) {
			System.out.printf("%3d",ball[i]);
		}
		System.out.println();
		
		// 3. 입력한 입력 번호 6개 + 출력
		// (1-45사이의 숫자를 안넣으면 다시 호출할 수 있도록 while 문 사용)
		int[] mynum = new int[6];
		int num = 0;
		int cnt = 0;
		
		while (cnt<6) {
			System.out.printf("%s번째 숫자를 입력하세요 >> ",(cnt+1));
			num = scan.nextInt();
			
			if (num<1 || num>45) {
				System.out.println("1-45사이의 숫자를 입력하셔야합니다. 다시 입력하세요.");
				continue;
			}
			mynum[cnt] = num;
			cnt++;
		}
		// 4. 입력한 번호, 로또 번호 출력
		//--------------------------------------
		System.out.println();
		System.out.printf("%18s \n","[ 당첨 결과 확인하기 ]");
		System.out.print("입력 번호 : ");
		for (int i=0;i<mynum.length;i++) {
			System.out.printf("%3d",mynum[i]);
		}
		System.out.println();

		System.out.print("로또 번호 : ");
		for (int i=0; i<6; i++) {
			System.out.printf("%3d",ball[i]);
		}
		System.out.println();
		//---------------------------------------
		
		// 5. 당첨번호개수 배열, 카운트 변수
		int count = 0;
		int[] chk = new int[6];
		for (int i=0; i<mynum.length; i++) {
			for (int j=0; j<mynum.length; j++) {
				if (mynum[i]==ball[j]) {
					chk[count] = mynum[i]; //chk 배열에 맞춘 숫자 넣어주기
					count++;
					break;
				}
			}
		}
		System.out.printf("맞춘 개수 : %3d \n",count);
		System.out.print("맞춘 번호 : ");
		if (count==0) {
			System.out.print("없음");
		}else {
		for (int i=0;i<count;i++) {
			System.out.printf("%3d",chk[i]);
			}
		}
	}
}
