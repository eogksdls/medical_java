package p0702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C0702_01 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		String stuNo="", name="";
		int kor=0,eng=0,math=0,total=0,rank=0;
		double avg=0;
		ArrayList<Students> list = new ArrayList<Students>();
//		List<Students> list = new ArrayList<Students>(); //둘 중에 하나
		
		// 파일에서 학생성적정보를 불러와 list에 저장
		FileReader fr = new FileReader("c:/save/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine(); //한줄씩 가져오기
			if(line == null) break; 
			String[] arr = line.split(",");
			stuNo = arr[0];
			name = arr[1];
			// String을 int 또는 double로 바꿔줌
			kor = Integer.parseInt(arr[2]);
			eng = Integer.parseInt(arr[3]);
			math = Integer.parseInt(arr[4]);
			total = Integer.parseInt(arr[5]);
			avg = Double.parseDouble(arr[6]);
			rank = Integer.parseInt(arr[7]);
			list.add(new Students(stuNo,name,kor,eng,math,total,avg,rank));
		}//while
		
		//------------------------------------------------------------------
		
		// 새롭게 입력한 학새성적정보 list에 저장.
		//count 
		Students.count = list.size()+1;
		while(true) {
			
			//학생입력부분 - 학번은 자동부여, 이름,국어,영어,수학만 넣으면 합계,평균은 자동계산
			System.out.print("학생 이름을 입력하세요.(x.종료)>> ");
			name = scan.next();
			
			//x 또는 X가 입력이 되면, 입력프로그램 종료
			if (name.equalsIgnoreCase("x")) {
				System.out.println("입력화면을 종료합니다.");
				break;
			}
			
			System.out.print("국어성적을 입력하세요.>> ");
			kor = scan.nextInt();
			System.out.print("영어성적을 입력하세요.>> ");
			eng = scan.nextInt();
			System.out.print("수학성적을 입력하세요.>> ");
			math = scan.nextInt();
			list.add(new Students(name,kor,eng,math));
			
		}//while
		
		
		// list 2명 학생성적을 추가해서 - 김유신,홍길순을 저장하시오
		//파일에 저장 
		String str = "";
		for (int i=0;i<list.size();i++) {
			Students s = list.get(i);
			str += s.toString();
		}	
		FileWriter fw = new FileWriter("c:/save/abc.txt"); // 이어쓰기
		BufferedWriter bw = new BufferedWriter(fw);// 한번에 저장
		bw.write(str);
		bw.close();
		
		
		//list출력 - 번호,이름,합계,평균,등수 만 출력하시오
		System.out.println("번호\t이름\t합계\t평균\t등수");
		for (int i=0;i<list.size();i++) {
			Students s = list.get(i);
			System.out.printf("%s\t%s\t%d\t%.1f\t%d\n",
					s.getStuNo(),s.getName(),s.getTotal(),s.getAvg(),s.getRank());
			
		}
			
		//----------------------------------------------------------------------------
			
//			try {
//				FileReader fr = new FileReader("c:/save/abc.txt");
//				BufferedReader br = new BufferedReader(fr);
//				while(true) {
//					String line = br.readLine(); //한줄씩 가져오기
//					if(line == null) break; 
//					String[] arr = line.split(",");
//					stuNo = arr[0];
//					name = arr[1];
//					// String을 int 또는 double로 바꿔줌
//					kor = Integer.parseInt(arr[2]);
//					eng = Integer.parseInt(arr[3]);
//					math = Integer.parseInt(arr[4]);
//					total = Integer.parseInt(arr[5]);
//					avg = Double.parseDouble(arr[6]);
//					rank = Integer.parseInt(arr[7]);
//					list.add(new Students(stuNo,name,kor,eng,math,total,avg,rank));
//				}
//				
//				//list출력 - 번호,이름,합계,평균,등수 만 출력하시오
//				System.out.println("번호\t이름\t합계\t평균\t등수");
//				for (int i=0;i<list.size();i++) {
//					Students s = list.get(i);
//					System.out.printf("%s\t%s\t%d\t%.1f\t%d\n",
//							s.getStuNo(),s.getName(),s.getTotal(),s.getAvg(),s.getRank());
//				}
//			
//			
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
