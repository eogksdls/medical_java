package p0627;

public class C0627_02 {
	public static void main(String[] args) {
		// 예외처리
		System.out.println("안녕하세여!");
		
		int[] arr = {1,2,3,4};
		for (int i=0;i<5;i++) {
			System.out.println(arr[i]);
		} // 런타임에러 : 실행중에 발생한 오류 -> 예외처리를 하면 프로그램 종료없이 계속 진행가능
		
	}
}
