package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1-100까지 랜덤숫자를 생성해서, 랜덤숫자를 맞추는 프로그램을 구현하시오
		// 숫자를 입력해서 큰 수를 입력하세요. 작은 수를 입력하세요
		// 10번까지만 입력가능하도록
		
		// 랜덤 숫자 : 45
		// 입력한 숫자 : 1 2 3 4 5 6 45
		int[] mynum = new int[10];
		int r_num = (int)(Math.random()*45)+1;
		System.out.println("랜덤 숫자 : "+r_num);
		
		int cnt = 0;
		while(cnt<10) {
			System.out.printf("%d번째 시도: 숫자를 입력하세요 >>",cnt+1);
			int chk = scan.nextInt();
			
			if (chk<1 || chk>100) {
				System.out.println("1-100사이의 숫자를 입력하셔야 합니다. 다시 입력하세요.");
				continue;
			} else if(r_num>chk){
				System.out.println("입력한 숫자보다 큽니다.");
				mynum[cnt] = chk;
				cnt++;
			} else if(r_num<chk){
				System.out.println("입력한 숫자보다 작습니다.");
				mynum[cnt] = chk;
				cnt++;
			} else {
				System.out.println("정답 입니다!");
				mynum[cnt] = chk;
				break;
			}
		}
		System.out.printf("시도한 횟수 : %d \n",cnt);
		System.out.print("입력한 숫자 : ");
		for (int i=0;i<cnt;i++) {
			System.out.print(mynum[i]+" ");
		}
		System.out.println();
		
		// 정답을 하나도 못맞췄을 때, 가장 근사치에 해당되는 값을 출력하시오
		int arr_no = 0; // 저장위치
		int temp = 0; // 저장값
		
		if (cnt+1>10) {
			int[] list = new int[10]; // 배열생성
			for (int i=0;i<cnt;i++) {
				int gap = Math.abs(r_num-mynum[i]);
				list[i] = gap;
			}
			System.out.println("정답과의 차 : "+Arrays.toString(list));
			
			for(int i=0;i<10;i++) {
				if(temp>=list[i]) {
					arr_no = i;
					temp = list[i];
				}
			}
			
			System.out.println("근사치 값 1개 : "+mynum[arr_no]);
		}
		
	}
}
