package p0620;

public class C0620_07 {

	public static void main(String[] args) {
		// 변수 사용
		int hour = 10;
		int minute = 10;
		int second = 10;
		
		int[] h = new int[10];
		int[] m = new int[10];
		int[] s = new int[10];
		
		// 배열에 대한 선언 -> 객체선언과 아무런 관련이 없다.
		Time[] tt = new Time[10];
		// 객체선언
		tt[0] = new Time(); // Time 객체선언
		tt[1] = new Time(); // Time 객체선언
		tt[1].hour = 10;
		tt[1].minute = 10;
		tt[1].second = 10;
		// tt[2] = new Time(); 객체 선언을 안해서 호출 불가능
		// tt[2].hour = 12;
		tt[1].hour = 12;
		System.out.println(tt[1].hour); //12
		
		// Time class 객체 사용
		// 객체선언
		Time t = new Time();
		t.hour = 10;
		t.minute = 10;
		t.second = 10;

	}

}
