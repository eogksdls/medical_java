package p0625;

public class Time { // 같은 클래스, 같은 패키지
	private int hour;
	private int minute;
	private int second;
	int day;
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if (hour<0 || hour>23) {
			System.out.println("잘못된 데이터를 입력하셨습니다.");
			return;
		}
		this.hour = hour;
	}
	

	
}
