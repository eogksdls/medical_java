package p0626;

import java.util.ArrayList;

public class Buyer {

	String userId;
	String userPw;
	int money;
	int bonusPoint;
//	Product[] cart = new Product[10];  //인스턴스변수
	ArrayList list = new ArrayList();
	int count; // 인스턴스변수
	
	Buyer(){}
	Buyer(String userId, String userPw, int money, int bonusPoint){
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
		
	}
	
	
	//  구매메소드 -> 부모의 참조변수 Product로 묶어버림
	void buy(Product p) {
		if(money<p.price) {
			System.out.printf("잔액이 부족합니다. (보유금액 : %d 만원) \n",money);
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // collection
//		cart[count++] = p; // 구매물품 저장
		System.out.printf("%s 제품을 구매했습니다. (보유금액 : %d 만원) \n",p.pName,money);
	}
	
	void summary() {
		System.out.println("[ 구매 내역 ]");
		int sum = 0;
		for (int i=0;i<list.size();i++) {
			Product p = (Product) list.get(i);
			System.out.println(p.pName);
			sum += p.price;
		}
		System.out.println("-------------------");
		System.out.printf("총 구매 개수 : %d 개 \n",list.size());
		System.out.printf("총 구매금액 : %d 만원 \n",sum);
	}
	

}
