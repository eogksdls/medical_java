package p0626;

import java.util.Scanner;

public class C0626_01 {

	public static void main(String[] args) {
		// 다형성 : 부모의 참조변수로 자손의 객체를 다룸
		Scanner scan = new Scanner(System.in);
		Buyer b = new Buyer("aaa","1111",100,0);
		while(true) {
			System.out.print("ID를 입력하세요.>> ");
			String id = scan.next();
			System.out.print("PW를 입력하세요.>> ");
			String pw = scan.next();
			
			if(b.userId.equals(id) && b.userPw.equals(pw)) {
				System.out.println("아이디와 패스워드가 일치합니다.");
				break;
			}else {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
			}
			
		}
		System.out.println("구매사이트로 이동합니다.");
		
	}
	
	

}
