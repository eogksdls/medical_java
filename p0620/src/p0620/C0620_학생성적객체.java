package p0620;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0620_학생성적객체 {
	
	int num = 0; // 인스턴스변수 - 객체선언 후 참조변수명.변수명
	static int n = 0; // 클래스변수 
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 변수선언부분 : 객체선언사용
		final int STU = 10;
		Stu_score[] sc = new Stu_score[STU]; // 배열선언
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0; //입력된 학생수
		
		
Loop1:while(true) {
			
			//화면부분
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("----------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 학생검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------------");
			System.out.print("원하는 서비스의 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				Loop2: while(s_count<STU) {
					System.out.println("[ 학생성적입력 ]");
					System.out.println("----------------------");
					// 학번자동생성
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yy");
					String stuNo1 = "S" + sdf.format(date) + String.format("%03d",s_count+100);
					// 객체 선언
					sc[s_count] = new Stu_score();
					// 학번 저장
					sc[s_count].stuNo = stuNo1;
					System.out.println("학생번호 : "+stuNo1);
					// 이름저장
					System.out.print("이름을 입력하세요.(0.이전페이지로 이동) >> ");
					sc[s_count].name = scan.nextLine();
					if ((sc[s_count].name).equals("0")) {
						System.out.println();
						System.out.println("*** 이전 페이지로 이동합니다. ***");
						System.out.println();
						break Loop2;
					}
					// 국어성적입력
					System.out.print("국어점수를 입력하세요. >> ");
					sc[s_count].kor = scan.nextInt();
					// 영어성적입력
					System.out.print("영어점수를 입력하세요. >> ");
					sc[s_count].eng = scan.nextInt();
					// 수학성적입력
					System.out.print("수학점수를 입력하세요. >> ");
					sc[s_count].math = scan.nextInt();
					scan.nextLine();
					
					// 합계, 평균 저장
					sc[s_count].total = sc[s_count].kor+sc[s_count].eng+sc[s_count].math;
					sc[s_count].avg = sc[s_count].total/3.0;
 					
					// 입력완료
					System.out.println("----------------------");
					System.out.printf("%s 학생의 성적저장이 완료되었습니다.",sc[s_count].name);
					System.out.println();
					
					s_count++;
					
				}//while Loop2
				break;
				
			case 2:
				System.out.println("\t\t       [ 학생성적출력 ]");
				System.out.println("------------------------------------------------------------");
				for (int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("------------------------------------------------------------");
				for (int i=0;i<s_count;i++) {
					System.out.printf("%s\t",sc[i].stuNo); //학번
					System.out.printf("%s\t",sc[i].name); //이름
					System.out.printf("%d\t",sc[i].kor); //국어
					System.out.printf("%d\t",sc[i].eng); //영어
					System.out.printf("%d\t",sc[i].math); //수학
					System.out.printf("%d\t",sc[i].total); //합계
					System.out.printf("%.2f\t",sc[i].avg); //평균
					System.out.printf("%d\n",sc[i].rank); //등수
					
				}
				System.out.println("------------------------------------------------------------");
				
				break;
			}//switch
			
		}//while
	}
}
