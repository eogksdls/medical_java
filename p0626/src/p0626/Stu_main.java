package p0626;

import java.util.ArrayList;

public class Stu_main{
	
	public static void main(String[] args) {
		//변수선언부분
		ArrayList list = new ArrayList();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",89,99,91));
		list.add(new Students("이순신",80,90,88));
		list.add(new Students("김구",100,99,99));
		list.add(new Students("김유신",50,80,71));
		list.add(new Students("홍길자",65,81,76));
		list.add(new Students("홍길순",78,86,95));
		Stu_process sp = new Stu_process();
		
		Loop1:while(true) {
			int choice = sp.screen(list); //화면부분 메소드 호출
			
			switch(choice) {
			case 1: //학생입력부분
				sp.stu_input(list);
				break;
			
			case 2: //학생성적출력부분
				sp.stu_print(list);
				break;
				
			case 3: //학생성적수정부분
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
				break;
			
			case 0: //프로그램종료
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("-------------------");
				System.out.println("*** 프로그램을 종료합니다. ***");
				System.out.println();
				break Loop1;
				
			}
			
		}
	}
	
	
}
	


