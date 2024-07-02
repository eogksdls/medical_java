package p0701;

import java.util.ArrayList;

public class C0701_02 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<Card>();
		
		list.add(new Card(1,"CLOVER"));
		list.add(new Card(10,"HEART"));
		list.add(new Card(2,"SPADE"));
		
		//list 출력
		for (int i=0;i<list.size();i++) {
//			Card c = (Card) list.get(i);
//			System.out.println(c.getKind()+","+c.getNumber());
			System.out.println(list.get(i));
		}
	}

}
