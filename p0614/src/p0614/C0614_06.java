package p0614;

public class C0614_06 {
	
	public static void main(String[] args) {
		float f = 1.6f;
		int i = (int) f; // float타입(큰)을 int타입(작은)으로 변경하려면 앞에 (type)을 적어줘야함
		System.out.println(i);
		
		int n = 10;
		float f1 = n;
		System.out.println(n);
		System.out.println(f1);
		
		int n2 = 65;
		char ch = (char) n2; // 정수(큰) -> 문자열(작은)
		System.out.println(ch);
		
		char ch2 = 'a';
		int n3 = ch2;
		System.out.println(n3);
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2);
	}
}
