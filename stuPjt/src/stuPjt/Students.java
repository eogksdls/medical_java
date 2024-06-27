package stuPjt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {
	// 같은 패키지 안에서 class 객체 호출가능
	static int count = 1;
	{ //초기화블럭
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		this.stuNo = "S"+sdf.format(d)+String.format("%03d", count);
		count++; //입력될 때마다 count 가 증가됨.
	}
	
	Students(){} //기본생성자
	Students(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
}
