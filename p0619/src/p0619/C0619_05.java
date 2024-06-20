package p0619;

import java.util.Scanner;

public class C0619_05 {

	public static void main(String[] args) {
		// Quiz!!
		// 5,5배열을 생성해서 1,1,1,1,1 나머지는 0으로 채워서 랜덤으로 섞어 출력하시오
		//------------------------------------------------------
		// 1. [5][5] 배열 생성
		int[][] arr = new int[5][5];
		// 초기에는 0의 값을 가지기 때문에 arr[0][?] 위치에 1, 5개만 넣어주기
		for (int i=0;i<arr.length;i++) {
			arr[0][i] = 1;
		}
		
		String[][] lotto = new String[5][5]; // 당첨 or 꽝 배열표
		for (int i=0;i<lotto.length;i++) {
			for (int j=0;j<lotto[i].length;j++) {
				lotto[i][j] = "♥";
			}
		}
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		// 기회는 5번
		while(cnt<5) {
		
			//------------------------------------------------------
			// 2. 랜덤으로 섞기(0,1 번호판)
			int no = 0;
			int no2 = 0;
			int temp = 0;
			for (int i=0;i<=200;i++) {
				no = (int)(Math.random()*5); //0-4
				no2 = (int)(Math.random()*5); //0-4
				
				temp = arr[0][0];
				arr[0][0] = arr[no][no2];
				arr[no][no2] = temp;
			}
			//------------------------------------------------------
			
			// 3. ♥ 문자 배열표 출력
			System.out.printf("%25s \n","[ 좌표 ]");
			System.out.println("   |\t0\t1\t2\t3\t4\t");
			System.out.println("----------------------------------------------");
			for (int i=0;i<arr.length;i++) {
				System.out.print(i+"  |\t");
				for (int j=0;j<arr[i].length;j++) {
					System.out.print(lotto[i][j]+"\t");				
				}
				System.out.println();
			}
			//------------------------------------------------------
			// 4. 좌표 입력 받기
			System.out.println("----------------------------------------------");
			System.out.print("세로 좌표를 입력하세요 >> ");
			int x = scan.nextInt();
			if (x>4 || x<0) {
				System.out.println("잘못된 좌표입니다. 다시 입력해주세요.");
				continue;
			}else {
				System.out.print("가로 좌표를 입력하세요 >> ");
				int y = scan.nextInt();
				if (y<0 || y>4) {
					System.out.println("잘못된 좌표입니다. 다시 입력해주세요.");
					continue;
				}else {
					// 입력 받은 좌표값이 확인이 된 좌표이면 확인이 된 좌표입니다. 라고 출력이 되고
					// 다시 입력받게끔 해주세요!
					if (lotto[x][y].equals("당첨") || lotto[x][y].equals("꽝!")) {
						System.out.println("이미 확인이 된 좌표입니다. 다시 선택해주세요.");
						continue;
					}else {
						// 5. arr배열에서 x,y의 좌표값을 비교
						// 1이면 당첨, 0이면 꽝!이 출력되도록 하려고 함
						if (arr[x][y]==1) {
							lotto[x][y] = "당첨";
						}else {
							lotto[x][y] = "꽝!";
						}
					}
				}
			}
			cnt++;
		
		}// while true
		
		// 소진 후 ♥ 문자 배열표 출력
		System.out.printf("%25s \n","[ 좌표 ]");
		System.out.println("   |\t0\t1\t2\t3\t4\t");
		System.out.println("----------------------------------------------");
		for (int i=0;i<arr.length;i++) {
			System.out.print(i+"  |\t");
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(lotto[i][j]+"\t");				
			}
			System.out.println();
		}
		System.out.println("!!! 주어진 기회를 모두 소진하였습니다. 다음 기회에.... !!!");
		
		// 3. 1번 번호 출력
//		System.out.printf("%25s \n","[ 좌표 ]");
//		System.out.println("   |\t0\t1\t2\t3\t4\t");
//		System.out.println("----------------------------------------------");
//		for (int i=0;i<arr.length;i++) {
//			System.out.print(i+"  |\t");
//			for (int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"\t");				
//			}
//			System.out.println();
//		}
	}
}
