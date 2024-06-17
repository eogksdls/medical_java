package p0614;

public class C0614_07 {

	public static void main(String[] args) {
		// 기본 자료형 간의 연산
		
		
		//printf의 출력
		// 소수점 제한 출력 가능, 8진수, 16진수 출력가능
		System.out.println(10.0/3);
		// 3.3333333333333335 -> 소숫점 15자리까지만 제대로 표현(double). 그 이후론 아무 숫자
		System.out.printf("%.2f \n", 10.0/3); // 3.33
		int x = 0x1a; // 16진수 표현 1a 값은? 1x16+0x16 = 16
		System.out.println("x : "+x);
		System.out.printf("%X \n", x); // printf 16진주 출력가능
		
		long a = 10L;
		System.out.printf("%d \n", a);
		int b = 20;
		System.out.printf("%d \n", b);
		
		int age = 10;
		int year = 2014;
		System.out.printf("나이 : %d 세, 년도 : %d 년 \n", age, year);
		System.out.println("나이 : "+age+"세, 년도 : "+year+"년");
		
		System.out.printf("[%5d] \n", 10);
		System.out.printf("[%05d] \n", 10);
		
		
		
	}
}
