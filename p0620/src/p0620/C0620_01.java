package p0620;

import java.util.Arrays;
import java.util.Scanner;

public class C0620_01 {
	
	public static void main(String[] args) {
		// lotto, 학생성적프로그램
		
		int[] score = new int[45];
		for (int i=0;i<score.length;i++) {
			score[i] = i+1;
		}
		System.out.println(Arrays.toString(score));
		
		
		//-----------------------------------------------------
		Scanner scan = new Scanner(System.in);
		// 1-25까지의 숫자를 넣고 배열을 섞기 하시오.
		// 1. 생성
		String[][] arr = new String[5][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = i*5 + (j+1) + "";
			}
		}
		// 2. 랜덤으로 섞기
		int no = 0;
		int no2 = 0;
		String temp = "0"; // 값 저장 역할
		for (int i=0;i<500;i++) {
			no = (int)(Math.random()*5); // 0-4
			no2 = (int)(Math.random()*5); // 0-4
			
			temp = arr[0][0];
			arr[0][0] = arr[no][no2];
			arr[no][no2] = temp;
		}
		
		int cnt = 0;
		while(cnt<25) {
			
			// 3. 출력
			System.out.println("[ 2차원배열 출력 ]");
			System.out.println("---------------------------------");
			for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("---------------------------------");
			
			// 원하는 값을 입력받으면, 그 입력값을 가지는 위치에 x표시 구현하기
			System.out.println("1-25사이의 숫자를 입력해주세요. >> ");
			int input = scan.nextInt();
			if (input<0 || input>25) {
				System.out.println("1-25까지의 숫자만 가능합니다. 다시 입력하세요.");
				System.out.println("**********************************");
				continue;
			}
			System.out.println("입력한 숫자 : "+input);
			System.out.println();
			// 1-25까지의 숫자를 넣으면 X표시가 나타나도록 구현하시오
			String input_str = input+"";
			int chk = 0;
			for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr[i].length;j++) {
					if (input_str.equals(arr[i][j])) {
						arr[i][j] = "X";
						cnt++;
						chk = 1;
						break;
					}else {
						continue;
					}
				}
			}
			if (chk==0) {
				System.out.printf("%s번은 이미 입력된 숫자입니다. 다시 입력하세요!!\n",input_str);
				System.out.println();
			}
			
		}//while
		System.out.println("--------- 참여기회를 모두 소진하셨습니다. --------");
		
		
	}
	
}
