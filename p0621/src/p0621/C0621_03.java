package p0621;

public class C0621_03 {

	public static void main(String[] args) {

		Cal cal = new Cal(); // Cal class : 객체선언
		int result = cal.add(10,5);
		System.out.println("result : "+result);
		
		
//		C0621_03 c = new C0621_03();
//		// 참조변수명.메소드명
//		int result = c.add(10,5);
//		System.out.println(result);
		
		
	} //main
	
	//메소드 선언
	//리턴타입과 return 결과값은 타입이 같아야함
	int add(int a, int b) {
		int result = a+b;
		return result;
	}// int add
	
	void add2(int a, int b) {
		System.out.println(a+b);
		// 리턴타입이 void 면 결과값도 void 이어야함
	} //void add2
		
} //class C0621_03
