package p0627;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class C0627_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("저장할 파일 이름을 입력하세요.>> ");
		String fileName = scan.nextLine();
		if (fileName.equals("")|| fileName == null)
			fileName = "제목없음";

		File f = new File("c:/save/"+fileName+".txt");  //aaa.txt
		// Exception 처리 - try-catch 또는 throw Exception
		
		try { // 하드웨어 용량이 부족해서 파일을 저장 못하는 예외가 발생할 수 있기 때문에, 예외처리를 해야함
			f.createNewFile();  // 새로운 파일 저장 실행문 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 예외발생 유무에 상관없이 무조건적으로 실행시켜야하는 내용
		}
		
		System.out.println("파일 1개가 저장되었습니다.");
		
	}
}
