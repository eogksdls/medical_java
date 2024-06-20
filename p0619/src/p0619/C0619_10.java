package p0619;

import java.util.Scanner;

public class C0619_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생 성적 입력부분 (3명)
		// 구현하시오.
		final int STU = 20; // 절대 바뀌지 않는 변수 : 전체 학생수 수정
		String[] stuNo = new String[STU];
		String[] name = new String[STU];
		int[][] score = new int[STU][4]; // 학생 STU명, 국어,영어,수학,합계
		double[] avg = new double[STU]; // 평균은 소수점
		int[] rank = new int[STU];
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0; // 입력된 학생수
		
		//--------프로그램 실행------------------
		Loop1:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("----------------------------------");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------------------------");
			System.out.print("원하시는 서비스의 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			scan.nextLine();
			System.out.println("----------------------------------");
			
			switch(choice) {
			case 0: //프로그램종료
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("!!! 프로그램을 종료합니다 !!!");
				System.out.println("----------------------------------");
				break Loop1;
			case 1: // 학생성적입력
				System.out.println("[ 학생성적입력 ]");
				Loop2:while(s_count<stuNo.length){
					System.out.println("----------------------------------");
					System.out.printf(">> %d번째 학생 입력 <<\n",s_count+1);
					stuNo[s_count] = "S"+String.format("%04d",s_count+1);
					System.out.println("학생번호 : "+stuNo[s_count]);
					System.out.print("이름을 입력하세요.(0.종료)>> ");
					name[s_count] = scan.nextLine();
					if (name[s_count].equals("0")) {
						System.out.println("*** 학생성적입력을 종료합니다. ***");
						break Loop2;
					}
					for (int i=0;i<3;i++) {
						System.out.printf("%s점수를 입력하세요.>> ",title[i+2]);
						score[s_count][i] = scan.nextInt();
						scan.nextLine();
					}
					score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
					avg[s_count] = score[s_count][3]/3.0;
					
					s_count++;
				}
				System.out.println("----------------------------------");
				break; //case1---------------------------------------------------------------------------------------
				
			case 2: // 학생성적출력
				System.out.println("[ 학생성적출력 ]");
				System.out.println("-----------------------------------------------------------------");
				for (int i=0;i<title.length;i++) {
					System.out.printf(title[i]+"\t");
				}
				System.out.println();
				System.out.println("-----------------------------------------------------------------");
				for (int i=0;i<s_count;i++) {
					System.out.printf("%s\t%s\t",stuNo[i],name[i]); // 학번,이름 출력
					for (int j=0;j<score[i].length;j++) {
						System.out.print(score[i][j]+"\t"); // 국어~합계 출력
					}
					System.out.printf("%.2f\t",avg[i]); // 평균 출력
					System.out.println(rank[i]); // 등수 출력 + 줄바꿈
				}
				System.out.println("-----------------------------------------------------------------");
				break; //case2--------------------------------------------------------------------------------------------------
				
			case 3: // 학생성적수정
				Loop3:while(true) {
					System.out.println("[ 학생성적수정 ]");
					System.out.println("----------------------------------");
					System.out.print("검색하고자 하는 학생 이름을 입력하세요.(0.종료) >> ");
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
				break;	//case3-------------------------------------------------------------------------------------------------
			default:
				System.out.println("해당 번호의 서비스가 없습니다. 다시 입력해주세요.");
				System.out.println("----------------------------------");
				break; //default-------------------------------------------------------------------------------------------------
				
			}//switch
			
			
		}//while
		
	}//main
}//class
