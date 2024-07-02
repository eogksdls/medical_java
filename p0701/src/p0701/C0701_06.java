package p0701;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class C0701_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Students> list = new ArrayList<Students>();
		//입력
		System.out.print("이름을 입력하세요.>> ");
		String name = scan.next();
		System.out.print("국어점수를 입력하세요.>> ");
		int kor = scan.nextInt();
		System.out.print("영어점수를 입력하세요.>> ");
		int eng = scan.nextInt();
		System.out.print("수학점수를 입력하세요.>> ");
		int math = scan.nextInt();
		
		list.add(new Students(name,kor,eng,math));
		
		// 1.txt 파일에 list 학생성적을 저장하시오.
		String str = ""+list.get(0);
		
		try {
			FileWriter fw = new FileWriter("c:/save/1.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("list 학생성적이 저장되었습니다.");
		for (int i=0;i<list.size();i++) {
			Students s = list.get(i);
			System.out.println(s);
		}
		
		
		
		
		
		//출력
//		ArrayList<Students> list = new ArrayList<Students>();
//		list.add(new Students("홍길동",100,100,100));
//		list.add(new Students("유관순",90,90,90));
//		list.add(new Students("이순신",70,70,70));
//		
//		// 이름,합계,평균만 모두 출력하시오
//		System.out.println("이름\t합계\t평균");
//		System.out.println("----------------------");
//		for (int i=0;i<list.size();i++) {
//			Students s = list.get(i);
//			System.out.printf("%s\t%s\t%.1f\n",s.getName(),s.getTotal(),s.getAvg());
//		}
			
	}

}
