package p0614;

public class C0614_01 {

	public static void main(String[] args) {
		
		// 논리형
		boolean bol = true;
		boolean bol2 = false;
		
		// 문자형
		char ch1 = 'a';
//		char ch2 = 'xx'; // 에러! char는 문자 1개만 저장가능
		char ch3 = ' '; // 빈공백은 저장가능
//		char ch4 = ''; // 에러!
		
		//정수형 - byte, short, int, long 타입
//		byte a = 128;  // 에러 : byte 127까지 입력가능
		short b = 2;
//		int c = 2147483648; // 2147483647 까지 입력가능
		long d = 2147483648L;  // long : 접미사 L을 써줘야함
		
		// 실수형 - float : 접미사 F를 붙여야함. ,double : default라 따로 접미사 작성할 필요없음 
		float e = 3.14F; // F를 '무조건' 붙여야함.
		double f = 3.14; // 접미사 D 생략 가능
		
		//정수형 - byte, short, int, long 타입
//		int num = 10;
//		System.out.println(num);
//		// print(num);

	}//main

} //class
