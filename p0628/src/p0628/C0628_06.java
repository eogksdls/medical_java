package p0628;

import java.util.ArrayList;
import java.util.Vector;

public class C0628_06 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		ArrayList<Students> list = new ArrayList<Students>();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",99,85,91));
		list.add(new Students("이순신",96,87,98));
		list.add(new Students("강감찬",61,73,99));
		list.add(new Students("홍길순",88,64,97));
		list.remove(1);
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
//		//ArryList<E> : generic
//		ArrayList<Card> list = new ArrayList<Card>();
//		list.add(new Card(1,"SPADE"));
//		list.add(new Card(2,"SPADE"));
//		list.add(new Card(2,"DIAMOND"));
//		list.add(new Card(3,"HEART"));
//		list.add(new Card(4,"CLOVER"));
////		list.add(new Students());
////		list.add("안녕"); // String -> int 형변환 안됨. 
//		
//		
//		for (int i=0;i<list.size();i++) {
//			// 원래 class는 object(조상)이었음 -> Card(자손)으로 형변환해야함
////			Card c = (Card) list.get(i); 
//			System.out.println(list.get(i).number+","+list.get(i).kind);
//		}
		
//		ArrayList list = new ArrayList();
//		list.add("홍길동");
//		list.add("유관순");
//		list.add("이순신");
//		list.add("김구");
//		list.add("강감찬");
//		list.remove(1); 	//index를 가지고 유관순삭제
//		list.remove("김구"); //객체형태로 삭제
//		
//		for (int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
//		//List - 순서가 있음, 중복을 허용
//		ArrayList list = new ArrayList();
//		list.add(1); //add 명령어 - 추가
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.remove(1); //remove : 삭제
//		
//		//size() : 컬렉션 크기 
//		for (int i=0;i<list.size();i++) {
//			System.out.println(list.get(i)); //get : 데이터를 읽어옴.
//		}
		
		
	}//main

}//class
