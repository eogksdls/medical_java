package P0617;

public class C0617_01 {
	public static void main(String[] args) {
		//python의 print()와 같은 기능
		System.out.println(7+7+""); //14
		System.out.println(""+7+7); //77
		
		char ch = 'a';
		System.out.println(ch);
		
		int num = 'a';
		System.out.println(num);  // 타입이 작은(char) 쪽에서 큰(int) 쪽으로 변환
		
		int num2 = 98;
		ch = (char)num2;
		System.out.println(ch);
		
		
	}
}
