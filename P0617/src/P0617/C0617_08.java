package P0617;

import java.util.Scanner;

public class C0617_08 {

	public static void main(String[] args) {
		// 삼항연산자 - ? :
		// 조건식에 부합하면 True : 부합하지 못하면 False 값을 반환한다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >> ");
		
		int x = scan.nextInt();
		int absX = (x>=0) ? x : -x;
		System.out.println(absX);

	}

}
