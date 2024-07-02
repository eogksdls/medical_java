package p0628;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class C0628_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력하세요.>> ");
		String str = scan.next();
		
		ArrayList<Card> list = new ArrayList();
		
//		list.add(new Card(1, Card.Kind.CLOVER));
		list.add(new Card(1,"SPADE"));
		list.add(new Card(1,"DIAMOND"));
//		list.add(new Card(3,"Spade"));
//		list.add(new Card(7,"spade"));
		list.add(new Card(7,"CLOVER"));
		list.add(new Card(2,"DIAMOND"));
		
		list.sort(new Comparator<Card>() {

			@Override //숫자, 문자열
			public int compare(Card o1, Card o2) {
//				return o1.
				return o2.getKind().compareTo(o1.getKind());
			}
			
		});
		
		for (int i=0;i<list.size();i++) {
			System.out.println();
		}
		
	}

}
