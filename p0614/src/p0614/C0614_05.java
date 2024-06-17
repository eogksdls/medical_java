package p0614;

public class C0614_05 {
	public static void main(String[] args) {

		byte b = 127;
//		byte b2 = 128; // 에러 표시해줌
		b = (byte) (b+1);
		System.out.println(b); 
		// -128 ~ 127이 하나의 밴드로 형성되어 있어서, 127 값보다 커지게 되면 -128이 된다.(오버플로우 발생)
		
		int num = 2147483647;
		num = num + 1;
		System.out.println(num);
		
		
		// 문자열 타입 변경
//		char ch = 'A';
////		chat ch2 = 'AA'; // 2개 이상 문자 안됨.
//		char ch3 = ' '; // 사이띄우기 가능
////		char ch4 = null; // null 안됨
//		
//		// 참조형 변수 그 어떤 것을 넣어도 다 됨 ""사용
//		String str = "AA";
//		String str2 = "";
//		String str3 = null;
//		
//		String s1 = "A" + "B";
//		System.out.println(s1); // AB
//		System.out.println(""+7+7+7); // 문자열+any type = 모두 문자열타입으로 변경
//		System.out.println(7+7+7+""); // 21 : 7이 3번 더해진 값이 나오지만 타입은 문자열로 변경 
//		System.out.println(7+7+7+""+7); // 217 : 문자열타입. 숫자 217이 아님
		
	}
}
