package p0701;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

	public static void main(String[] args) throws Exception {
			
		// 1byte씩 저장
		FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
			String str = "S00001,홍길동,100,100,100,300,100.0,0\r\n";
			str += "S00002,유관순,50,50,50,150,50.0,0\r\n";
			byte[] bytes = str.getBytes(); // 1byte씩 쪼개서 배열에 넣어 저장시켜주는 것 
			for (byte b : bytes) { // 단순 for문
					fos.write(b);
			}
		
		
		//try-catch문
//		try {
			// 1byte씩 
//			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
//			String str = "S00001,홍길동,100,100,100,300,100.0,0\r\n";
//			str += "S00002,유관순,50,50,50,150,50.0,0\r\n";
//			byte[] bytes = str.getBytes(); // 1byte씩 쪼개서 배열에 넣어 저장시켜주는 것 
//			for (byte b : bytes) { // 단순 for문
//					fos.write(b);
//			}
////			for (int i=0;i<bytes.length;i++) {
////				fos.write(bytes[i]);
////			}
//		}catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("파일에 글이 저장되었습니다.!");
//		
		
		// 파일생성, 폴더 생성
//		String str = "c:/save1";
//		File folder = new File(str); 
//		File file = new File(str+"/14.txt");
//		try {
//			if (!(folder.isDirectory())) { // folder.exists() or folder.mkdirs()
//				System.out.println("폴더를 생성했습니다.");
//				folder.mkdirs(); // 폴더 경로가 존재하지 않는 경우, 폴더를 새로 만들어 파일을 저장한다.
//			}
//			file.createNewFile(); //이미 폴더가 존재하는 경우, 그 폴더 안으로 새로운 텍스트 파일 생성
//		}catch (IOException e){ e.printStackTrace();}
//		
//		System.out.println("파일이 생성되었습니다.");
	}

}
