package P0617;

public class C0617_05 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		System.out.println((int)(pi*1000)/1000f);  // 3.141 소숫점 절사
		// (int)3141.592 -> 3141
		// 3141 / 1000f -> 3.141
		
	}
}