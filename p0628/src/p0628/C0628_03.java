package p0628;

import java.util.Scanner;

public class C0628_03 {
	
	public static void main(String[] args) {
		//문자열을 입력받아, 2번째의 문자를 출력하시오오오오
		// charAt(n) 사용
		// 문자열이 3칸 미만으로 입력이 되면, 다시 입력을 할수 있도록 하시오.
		// 무한반복 - X가 입력되면 프로그램을 종료하시오.
		Scanner scan  = new Scanner(System.in);
		while (true){
			System.out.print("문자를 입력하세요.(X.종료) >> ");
			String str = scan.nextLine(); //공백까지 모두 포함한 한 줄 가져오기
			if (str.equalsIgnoreCase("x")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if (str.length()<3) {
				System.out.println("입력한 문자의 길이가 너무 짧습니다. 다시 입력하세요.");
				System.out.println();
				continue;
			}else {
				System.out.printf("3번째 위치의 문자를 반환합니다. : %s \n", str.charAt(2));
				System.out.println();
				
			}
		}//while
		
		
	}//main
	
}//class
