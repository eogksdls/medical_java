package p0624;

import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		
		for (int i=0;i<num.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요. >> ",(i+1));
			num[i] = scan.nextInt();
			
		}
		
		// Cal class 객체선언 후, 참조변수명.메소드명
		Cal c = new Cal();
		int result = c.add(num[0],num[1],num[2]);
		System.out.println("합계 : "+result);
		
		int sum = c.add(num);
		System.out.println("합계 : "+sum);
		
		// 세 개의 수를 입력받아, 세 개의 수를 더한 값을 구하시오.
//		int[] num = new int[3];
//		int sum = 0;
//		for (int i=0;i<num.length;i++) {
//			System.out.printf("%d번째 숫자를 입력하세요. >> ",(i+1));
//			num[i] = scan.nextInt();
//			sum += num[i];
//		}
//		
//		System.out.println("합계 : "+sum);
		
		
//		// 두 수를 입력받아, 두 수 를 더한 값을 출력하시오.
//		System.out.print("1번째 숫자를 입력하세요.>> ");
//		int n1 = scan.nextInt();
//		
//		System.out.print("2번째 숫자를 입력하세요.>> ");
//		int n2 = scan.nextInt();
//		
//		System.out.println("더한 값 : "+(n1+n2));
		
		
	}//main
	
}//class
