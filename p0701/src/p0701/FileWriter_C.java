package p0701;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_C {

	public static void main(String[] args) {
		String str = "S00003,이순신,90,90,90,270,90.0,0\r\n";
		str += "S00004,김구,80,80,80,240,80.0,0\r\n";
		str += "S00005,강감찬,60,60,60,180,60.0,0\r\n";
		
		 try { // OutputStream.java 파일에서 저장한 str 위에 이어쓰기
			FileWriter fw = new FileWriter("c:/save/abc.txt",true); //false:덮어쓰기, true:이어쓰기
			BufferedWriter bw = new BufferedWriter(fw); // 한 번에 저장
			bw.write(str);
			bw.close();
		} catch (IOException e) { e.printStackTrace(); }
	}

}
