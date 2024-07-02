package p0701;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputStream_Filesave {

	public static void main(String[] args) {
		File f = new File("c:/save1");
		if(!f.exists()) f.mkdir(); //폴더가 없으면 만들고, 있으면 넘어가
		
		try {
			FileInputStream fis = new FileInputStream("c:/save/n.jpg");
			FileOutputStream fos = new FileOutputStream("c:/save1/n2.jpg");
			while(true) {
				int read = fis.read();
				if(read==-1) break;
				fos.write(read);
			}
			
//			while((read = fis.read()) != -1)) { //fis.read() 파일의 데이터를 읽어옴. read에 데이터를 넣어줌
//				fos.write(read);
//			}
			fis.close();
			fos.close();
			
		}catch (Exception e) { e.printStackTrace(); }
		
		System.out.println("이미지가 저장되었습니다.");
	}

}
