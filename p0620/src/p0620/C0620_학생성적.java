package p0620;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0620_학생성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int STU = 10;
		String[] stuNo = new String[STU]; //학번
		String[] name = new String[STU]; //이름
		int[][] score = new int[STU][4]; //국어,영어,수학,합계
		double[] avg = new double[STU]; // 평균
		int[] rank = new int[STU]; // 등수
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
		//			"학번","이름","국어","영어","수학","합계","평균","등수"
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yy");
					String stuNo1 = "S" + sdf.format(date) + String.format("%03d",s_count+100);
					System.out.println("학생번호 : "+stuNo1);
					// 학번 저장
					stuNo[s_count] = stuNo1;
					// 이름 저장
					System.out.print("이름을 입력하세요.(0.취소) >> ");
					name[s_count] = scan.nextLine();
					if (name[s_count].equals("0")) {
						System.out.println("*** 학생성적입력을 종료합니다. ***");
						System.out.println("---------------------------");
						break Loop2;
					}
					// 국어,영어,수학 점수 저장
					System.out.print("국어점수를 입력하세요. >> ");
					score[s_count][0] = scan.nextInt();
					System.out.print("영어점수를 입력하세요. >> ");
					score[s_count][1] = scan.nextInt();
					System.out.print("수학점수를 입력하세요. >> ");
					score[s_count][2] = scan.nextInt();
					scan.nextLine();
					// 합계저장
					score[s_count][3] = score[s_count][0] + score[s_count][1] + score[s_count][2];
					// 평균 저장
					avg[s_count] = score[s_count][3]/3.0;
					
					// 입력완료
					System.out.printf("%s 학생성적이 저장되었습니다.",name[s_count]);
					System.out.println();
					
					s_count++;
				}//while Loop2
				break;
				
			case 2:
				System.out.println("[ 학생성적출력 ]");
				System.out.println("----------------------");
				for (int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("------------------------------------------------------------");
				for (int i=0;i<s_count;i++) {
					System.out.printf("%s\t",stuNo[i]);
					System.out.printf("%s\t",name[i]);
					for (int j=0;j<score[i].length;j++) {
						System.out.printf("%d\t",score[i][j]); // 국어,영어,수학,합계 출력
					}
					System.out.printf("%.2f\t",avg[i]); //평균
					System.out.printf("%d\n",rank[i]); //등수
				}
				System.out.println("------------------------------------------------------------");
				break;
				
			case 3:// 학생성적수정
				Loop3 :while(true) {
					System.out.println("[ 학생성적수정 ]");
					System.out.println("----------------------");
					System.out.print("수정하고자 하는 학생 이름을 입력하세요.(0.종료) >> ");
					String search = scan.nextLine();
					if (search.equals("0")) {
						System.out.println("*** 학생성적수정을 종료합니다. ***");
						break Loop3;
					}
					System.out.println("입력된 이름 : "+search);
					
					// 검색
					int temp_no = -1;// 임시 index number
					for (int i=0;i<s_count;i++) {
						if(name[i].equals(search)) {
							temp_no = i; // 찾는 학생이 검색되었을 경우
							System.out.printf("%s 학생이 검색되었습니다. \n",name[temp_no]);
							
							// 해당학생 성적 출력
							System.out.printf("[ %s 학생성적출력 ]\n",name[temp_no]);
							System.out.println("-----------------------------------------------------------------");
							for (int k=0;k<title.length;k++) {
								System.out.printf(title[k]+"\t");
							}
							System.out.println();
							System.out.println("-----------------------------------------------------------------");
							System.out.printf("%s\t%s\t",stuNo[temp_no],name[temp_no]); // 학번,이름 출력
							for (int j=0;j<score[temp_no].length;j++) {
								System.out.print(score[temp_no][j]+"\t"); // 국어~합계 출력
							}
							System.out.printf("%.2f\t",avg[temp_no]); // 평균 출력
							System.out.println(rank[temp_no]); // 등수 출력 + 줄바꿈
							System.out.println("-----------------------------------------------------------------");
							
							// 학생 검색 후 진행
							System.out.println("1. 국어성적수정");
							System.out.println("2. 영어성적수정");
							System.out.println("3. 수학성적수정");
							System.out.println("----------------------------------");
							System.out.print("원하는 번호를 입력하세요. >> ");
							choice = scan.nextInt();
							scan.nextLine();
							
							switch(choice) {
							case 1: // 국어성적수정
								System.out.printf("[ %s성적수정 ] \n",title[choice+1]);
								System.out.printf("현재 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
								System.out.println("----------------------------------");
								System.out.printf("변경할 %s점수를 입력하세요.>> ",title[choice+1]);
								score[temp_no][choice-1] = scan.nextInt();
								scan.nextLine();
								//합계, 평균도 변경해야함
								score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
								avg[temp_no] = score[temp_no][3]/3.0;
								System.out.printf("변경된 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
								break;
							case 2: // 영어성적수정
								System.out.printf("[ %s성적수정 ] \n",title[choice+1]);
								System.out.printf("현재 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
								System.out.println("----------------------------------");
								System.out.printf("변경할 %s점수를 입력하세요.>> ",title[choice+1]);
								score[temp_no][choice-1] = scan.nextInt();
								scan.nextLine();
								//합계, 평균도 변경해야함
								score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
								avg[temp_no] = score[temp_no][3]/3.0;
								System.out.printf("변경된 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
								break;
							case 3: // 수학성적수정
								System.out.printf("[ %s성적수정 ] \n",title[choice+1]);
								System.out.printf("현재 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
								System.out.println("----------------------------------");
								System.out.printf("변경할 %s점수를 입력하세요.>> ",title[choice+1]);
								score[temp_no][choice-1] = scan.nextInt();
								scan.nextLine();
								//합계, 평균도 변경해야함
								score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
								avg[temp_no] = score[temp_no][3]/3.0;
								System.out.printf("변경된 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
								break;
							default:
								System.out.println("*** 해당하는 번호가 없습니다. 다시 입력해주세요. ***");
								break;
								
							}//switch
							
						}
						
					}//검색 for문
					
					if(temp_no==-1) { // 찾는 학생이 없을 경우
						System.out.println("*** 찾는 학생이 없습니다. 다시 입력하세요! ***");
						continue; // 다시 학생검색창으로 돌아감
					}
						
					
				}//while Loop3
				break;
				
			case 4:
				System.out.println("[ 학생성적검색 ]");
				System.out.println("----------------------");
				System.out.println("1. 학생이름으로 검색");
				System.out.println("2. 합계점수로 검색");
				System.out.println("----------------------");
				System.out.print("원하는 번호를 입력하세요. >> ");
				int ch = scan.nextInt(); 
				scan.nextLine();
				
				switch(ch) {
				case 1: //학생 이름으로 검색
					System.out.print("학생 이름을 검색하세요. >> ");
					String search = scan.nextLine();
					
					for (int j=0;j<title.length;j++) {
						System.out.printf("%s\t",title[j]);
					}
					System.out.println();
					System.out.println("------------------------------------------------------------");
					int cnt1 = 0;
					for (int i=0;i<s_count;i++) {
						if (name[i].contains(search)) {
							
							System.out.printf("%s\t%s\t",stuNo[i],name[i]);
							for (int j=0;j<score[i].length;j++) {
								System.out.printf("%d\t",score[i][j]); // 국어,영어,수학,합계 출력
							}
							System.out.printf("%.2f\t",avg[i]); //평균
							System.out.printf("%d\n",rank[i]); //등수
							cnt1 = 1;
						}
						
					}
					System.out.println("------------------------------------------------------------");
					
					if (cnt1==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력하세요!");
						System.out.println();
					}
					break;
				
				case 2: // 합계 점수로 검색
					System.out.print("합계점수를 검색하세요. >> ");
					int sum = scan.nextInt();
					scan.nextLine();
					
					for (int j=0;j<title.length;j++) {
						System.out.printf("%s\t",title[j]);
					}
					System.out.println();
					System.out.println("------------------------------------------------------------");
					int cnt2 = 0;
					for (int i=0;i<s_count;i++) {
						if (score[i][3]==sum) {
							
							System.out.printf("%s\t%s\t",stuNo[i],name[i]);
							for (int j=0;j<score[i].length;j++) {
								System.out.printf("%d\t",score[i][j]); // 국어,영어,수학,합계 출력
							}
							System.out.printf("%.2f\t",avg[i]); //평균
							System.out.printf("%d\n",rank[i]); //등수
							cnt2 = 1;
						}
						
					}
					System.out.println("------------------------------------------------------------");
					
					if (cnt2==0) {
						System.out.println("입력하신 합계점수를 가진 학생이 없습니다. 다시 입력하세요!");
						System.out.println();
					}
					break;
				}//학생검색 switch
				
				
			case 5:
				System.out.println("[ 등수처리 ]");
				System.out.println("----------------------");
				for (int i=0;i<s_count;i++) {
					int count = 1;
					for (int j=0;j<s_count;j++) 
						if (score[i][3]<score[j][3]) count++;
					rank[i]= count;
				}
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println("----------------------");
				break;
				
			case 0:
				System.out.println();
				System.out.println("***** 프로그램을 종료합니다. *****");
				break Loop1;
			}//switch
			
		}//while Loop1
		
	}//main
	
}//class
