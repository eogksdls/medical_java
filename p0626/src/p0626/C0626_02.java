package p0626;

public class C0626_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer("aaa","1111",1000,0);
		
		// 구매내역
//		Product[] p = new Product[10];
		
		//Tv 구매 -> 다형성 이용
		Product t = new Tv();
		Product t2 = new Tv();
		b.buy(t); 		// Tv 1대 구매
		b.buy(t2);// Tv 1대 구매

		// 컴퓨터 구매
		Product c = new Computer();
		b.buy(c);
		
		// Audio 구매
		Product a = new Audio();
		b.buy(a);
		
		// 냉장고 구매
		Product r = new Refrigerator();
		b.buy(r);
		
		// 추가구매
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Refrigerator());
		b.buy(new Computer());
		b.buy(new Computer());
		
		// cart안에 있는 제품명, 가격을 모두 출력하시오.
		b.summary();
		
//		System.out.println("[ 구매 내역 ]");
//		int sum = 0;
//		for (int i=0;i<b.list.size();i++) {
//			Product p = (Product) b.list.get(i);
//			System.out.println(p.pName);
//			sum += p.price;
//		}
//		System.out.println("-------------------");
//		System.out.printf("총 구매 개수 : %d 개 \n",b.list.size());
//		System.out.printf("총 구매금액 : %d 만원 \n",sum);
		
		
		
		
////		b.cart : 배열
//		int sum = 0;
//		System.out.println("[ 구매 내역 ]");
//		for (int i=0;i<b.count;i++) {
//			System.out.printf("구매물품 : %s, 가격 : %d 만원 \n",b.cart[i].pName,b.cart[i].price);
//			sum += b.cart[i].price;
//		}
//		System.out.println("--------------------------------");
//		System.out.print("[ 총 합계 ] \t");
//		System.out.printf("%d 만원 \n",sum);
		
	}

}
