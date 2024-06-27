package p0624;

public class C0624_08 {

	public static void main(String[] args) {
		
		Stu_score stu;
		Stu_score s = new Stu_score("홍길동",100,99,90);
		System.out.println("합계 : "+s.total);
		System.out.println("평균 : "+s.avg);
		Stu_score s2 = new Stu_score();
		s.kor = 100;
		
		System.out.println("s.kor : "+s.kor);
		
		int a = 10;
//		int a = 100;
		
		
		// 5 팩토리얼 -> 5*4*3*2*1
		int result = 1;
		for (int i=4;i>0;i--) {
			result *= i;
		}
		
		//change() 메소드 사용
		C0624_08 c = new C0624_08();
		c.change();
		
		System.out.println(result);
		add(); // 객체선언 없이 클래스명.메소드명 , 같은 클래스내에서는 클래스명 생략가능
	}
	
	void change() {
		// 인스턴스 메소드 - 객체선언 후, 참조변수명.메소드명
	}
	
	void change(int a) {
		// 기존에 있던 메소드 overloading 
		// : 이름은 똑같은데, 매개변수를 다르게 해줌으로써 다른 메소드로 사용할 수 있게됨
		// 매개변수 type을 다르게 해주던지, 개수를 다르게 해줘야한다.
		System.out.println(a);
		
	}
	void change(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void add() {
		
	}
}
