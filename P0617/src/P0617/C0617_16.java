package P0617;

import java.util.Scanner;

public class C0617_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 구구단 출력시 1,3,5,7,9 홀수단을 출력하시오.
		for (int i=2;i<=9;i++) {
			if (i%2==0) continue;
			System.out.printf("[ %d단 ] \n",i);
			for (int j=1;j<=9;j++)
				System.out.printf(" %d * %d = %d \t",i,j,i*j);
			System.out.println();
		}
		
//		// 1-10까지의 합을 구해보세요
//		int sum = 0;
//		int i = 0;
//		for (i=1;i<=10;i++) {
//			sum = sum + i;
//		}
//		System.out.printf("%d까지의 합 : %d",i-1,sum);
		
//		// 1-100까지 합을 구하는데, sum값이 150을 넘었을 때의 i,sum값을 출력하시오
//		int sum = 0;
//		int i = 0;
//		for (i=1;i<=100;i++) {
//			sum = sum + i;
//			if (sum>=5) break;	// 반복문을 빠져나올 수 있도록	
//		}
//		System.out.printf(" %d번째 합 : %d",i,sum);
		
		
//		// 구구단 중첩 for 문 사용
//		System.out.println("[ 구구단 프로그램 ]");
//		for (int i=2; i<=9; i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for (int j=1; j<=10; j++) {
////				System.out.println(i+" * "+j+" = "+(i*j));
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
//		// 10번 입력받을 떄마다 합계를 출력하시오

//		int sum = 0;
//		for (int i=1;i<=10;i++) {
//			System.out.println(i+"번째 숫자를 입력하세요 >>");
//			int input = scan.nextInt();
//			sum = sum + input;
//			
//			System.out.println("합계 : "+sum);
//		}
		
		
		// 1-100까지 홀수만 더해서 최종값을 출력하시오
		// 1-100까지 숫자를 더해서 출력하시오
//		int sum = 0;
//		for (int i=1;i<=100;i+=2) {
//			sum = sum + i;
////			System.out.println("i : "+i);
////			System.out.println("sum : "+sum);
//		}
//		System.out.println("최종 홀수 sum : "+sum);
//		
//		int sum1 = 0;
//		for (int j=1;j<=100;j++) {
//			sum1 = sum1 + j;
//		}
//		System.out.println("최종 sum : "+sum1);
//		// for 문
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			sum = sum + i;
//			System.out.println("i : "+i);
//			System.out.println("sum : "+sum);
//		}
//		System.out.println("최종 sum : "+sum);
	}
}
