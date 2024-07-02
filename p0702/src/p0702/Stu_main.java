package p0702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Stu_main {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		ArrayList<Students> list = new ArrayList<Students>();
		int choice = 0;
		String stuNo="", name="";
		int kor=0,eng=0,math=0,total=0,rank=0;
		double avg=0;
		
		// save/abc.txt 에 들어있는 학생성적정보 읽어오기
		FileReader fr = new FileReader("c:/save/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine(); //한줄씩 가져오기
			if(line == null) break;
			String[] arr = line.split(",");
			stuNo = arr[0];
			name = arr[1];
			kor = Integer.parseInt(arr[2]);
			eng = Integer.parseInt(arr[3]);
			math = Integer.parseInt(arr[4]);
			total = Integer.parseInt(arr[5]);
			avg = Double.parseDouble(arr[6]);
			rank = Integer.parseInt(arr[7]);
			list.add(new Students(stuNo,name,kor,eng,math,total,avg,rank));
		}//파일 읽어오는 while문
		
		//count 파일에서 읽어온 학생수 만큼
		//list 마지막 번호 가져오기
		
		String lastStr = list.get(list.size()-1).getStuNo().substring(1);
		Students.count = Integer.parseInt(lastStr)+1;
		
		Stu_process sp = new Stu_process();
		
		Loop1:while(true) {
			
			choice = sp.screen(list);
			
			switch(choice) {
			case 1:  // 학생성적 입력
				sp.stu_input(list);
				break;
				
			case 2: // 학생성적출력
				sp.stu_print(list);
				break;
				
			case 3: //학생성적수정
				sp.stu_update(list);
				break;
				
			case 4: //학생삭제
				sp.stu_delete(list);
				break;
				
			case 5: //학생검색
				sp.stu_search(list);
				break;
				
			case 6: //등수처리
				sp.stu_rank(list);
				break;
				
			case 7: //학생성적정렬
				sp.stu_align(list);
				break;
				
			case 8: //파일에 저장
				sp.stu_save(list);
				break;
				
			case 0: //프로그램 종료
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("-------------------");
				System.out.println("*** 프로그램을 종료합니다. ***");
				System.out.println();
				break Loop1;
				
			default:
				System.out.println("*** 해당하는 서비스가 없습니다. 다시 입력해주세요. ***");
			}//switch
			
		}//while
		
		
	}//main		
	
}//class
