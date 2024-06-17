package P0617;

public class C0617_02 {
	public static void main(String[] args) {
		int a = 10;
		int b= 3;
		System.out.print("줄단락이 안되는 출력함수 println은 줄단락이 포함되어있다");
		System.out.println(a/(double)b);
		System.out.println(10/3.0); // 3.0은 double 타입
		System.out.printf("%.2f  \n", 10/3.0);
		System.out.println("aaa");
		System.out.printf("%x ln", 15);
		System.out.printf("%o ln", 15);
		System.out.printf("%s ln", Integer.toBinaryString(15)); //2진수->문자열변경 
		
	}
}
