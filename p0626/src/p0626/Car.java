package p0626;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
	
	static int count = 1;
	{ // 초기화블럭
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		this.serialNo = "C"+sdf.format(d)+String.format("%03d", count);
		count++;
	}
	Car(){	} //기본생성자
	Car(String color,int door){
		this.color = color;
		this.door = door;
	}

	
	String serialNo;
	String color;
	int door;
}
