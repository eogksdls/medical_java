package p0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) {
		
		//기본적인 InputStream 형태 1byte씩 가져오기
		try{
			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
			int read = 0;
			while((read = fis.read()) != -1) { // fis.read() 파일의 데이터를 읽어옴. read에 데이터 넣어줌. read -1이면 종료
					System.out.println(read); // 97 98 99 100 101 102 103 104 105 106...
					System.out.println((char)read); // a b c d e f g h i j k l m n o p
			
			}
		}catch (Exception e) {e.printStackTrace();}
		
//		try{
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			int read = 0;
//			try{
//				while((read = fis.read()) != -1) { // fis.read() 파일의 데이터를 읽어옴. read에 데이터 넣어줌. read -1이면 종료
//					System.out.println(read); // 97 98 99 100 101 102 103 104 105 106...
//					System.out.println((char)read); // a b c d e f g h i j k l m n o p
//				}
//			}catch (IOException e) { e.printStackTrace(); }
//			
//			
//		}catch (FileNotFoundException e) {e.printStackTrace();}
		
		
//		byte[] b = new byte[1024]; // 1byte씩 말고 1024byte씩 가져오기(한 문장~ 한 문단 통째로 가져오기)
//		try{
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			fis.read(b); //파일 읽어오기
//			System.out.println(new String(b));
//		
//		} catch (Exception e) {e.printStackTrace();}
	}

}
