package p0625;

public class C0625_02 {

	public static void main(String[] args) {
		
		Deck d = new Deck(); // 52장 카드 생성 - number, kind
		
		// 5장을 뽑는 메소드를 구현해서 실행하시오.
		d.shuffle();
		Card[] card = d.pick5();
		
		for (int i=0;i<5;i++) {
			System.out.printf("카드 %d : [ %s, %d ] \n",i+1,card[i].kind, card[i].number);
		}
		System.out.println();
		
		// 5장 또 뽑기
		Card[] card2 = d.pick5();
		
		for (int i=0;i<5;i++) {
			System.out.printf("카드 %d : [ %s, %d ] \n",i+1,card2[i].kind, card2[i].number);
		}
		
		System.out.println("card 객체 : "+card2[0]);
		
		// 카드 섞기
//		d.shuffle(); 
		
		// 카드 1장 뽑기
//		Card card = d.pick();
//		System.out.printf("카드 1장 : [ %s, %d ] \n",card.kind,card.number);
//		
//		// 카드섞고 나서 1장 뽑기
//		Card card2 = d.pick(3);
//		System.out.printf("카드 1장 : [ %s, %d ] \n",card2.kind,card2.number);
		
		
		// 출력부분
//		for (int i=0;i<52;i++) {
//			System.out.printf("카드 %d : [ %s, %d ] \n",i+1, d.c[i].kind, d.c[i].number);
//		}
		
	}
}
