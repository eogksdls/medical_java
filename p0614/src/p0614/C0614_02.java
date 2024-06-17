package p0614;

public class C0614_02 {

	public static void main(String[] args) {
		int score=0;
//		int score; // 변수는 초기화 없이 사용할 수 없음
		System.out.println(score);
		
		// 문자형
		char ch = 'a';
//		char ch2 = 'abc';
		char ch3 = 'a';
		char ch4 = 'b';
		char ch5 = 'c';  // 'abc'쓰려면 ch3~5를 더해야함 불편!!
		
		// 그래서 나온게 참조형 변수
		// 기본형 타입 이외 모든 참조형 타입은 new 연산자를 사용해야 함.(무조건 규칙)
		String str = new String("abc");
		System.out.println(str);
		
		String str2 = "abcde";  // 참조형 변수는 ""쓰기
		System.out.println(str2);
		
		int max = 10;
		max = 30;
		System.out.println(max); // 30
		
		final int MIN = 20; // 보통 상수는 대문자로 작성
//		MIN = 10; // final 상수는 값을 변경할 수 없음.
		System.out.println(MIN);
		
	}

}
