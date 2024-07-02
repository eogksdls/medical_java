package p0628;

public class C0628_01 {

	public static void main(String[] args) {
//		int a = 0;
//		for (int i=0;i<5;i++) {
//			a = a + 1;
//		}
//		System.out.println(a);  //5
		
		String a = "0";
		for (int i=0;i<5;i++) {
			a = a + 1;
		}
		System.out.println(a); // 011111
		
//		char ch = ''; // 에러, 공백없음
		char ch = ' '; // 가능
		String str = ""; //가능
		String str2 = " "; //가능
		
		
	}

}
