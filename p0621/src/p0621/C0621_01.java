package p0621;

public class C0621_01 {
	
	int i = 0;
	static int j = 0;
	
	void add() {
		int i = 0;
	}

	void add2() {
		int i = 0;
	}
	
	

	public static void main(String[] args) {
		
		// 위 C0621_01 class 객체선언
		C0621_01 c = new C0621_01();
		c.i = 10;  // 인스턴스변수 사용
		C0621_01.j = 10; // 클래스변수 사용
		j = 10; // 클래스변수는 같은 클래스 내에서는 클래스명 생략 가능..!
		
		
		
		Time[] t = new Time[3]; // 배열선언
		
		t[0] = new Time();  // 객체선언
		t[1] = new Time();  // 객체선언
		t[2] = new Time();  // 객체선언
		
//		t[0].day = 21;
		Time.day = 21; // 클래스변수 사용 -> 클래스명.변수명 (같은 클래스의 모든 인스턴스들이 공유하는 변수이다)
		t[0].hour = 10;  // 인스턴스변수 사용 -> 참조변수명.변수명
		t[0].minute = 10;
		t[0].second = 10;
		
		Time.day = 25;
		t[1].hour = 20;
		t[1].minute = 11;
		t[1].second = 11;
		
		System.out.printf("일시 : %d일 %d시 %d분 %d초  \n",t[0].day,t[0].hour,t[0].minute,t[0].second);
		System.out.printf("일시 : %d일 %d시 %d분 %d초  \n",t[1].day,t[1].hour,t[1].minute,t[1].second);
		
		Time tt = new Time();  // 객체선언
		
		
		
//		int i = 0; // 모든 클래스 내에서 같은 변수를 사용할 수 없다.
//		for (int i=0;i<5;i++) {
//			System.out.println(i);
//		}
//		//for문 안에 있는 i는 for문을 빠져나오면 사라지기 때문에, 중복으로 사용 가능하다.
//		for (int i=0;i<5;i++) {
//			System.out.println(i);
//		}
		
		
		
	}
}
