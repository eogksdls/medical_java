package p0626;

public class Refrigerator extends Product{ 

	//  Product 상속 안받고 독립적으로 생성하면, 변수를 일일이 생성해야한다.
	// buyer 클래스에서도 따로 메소드를 생성해줘야함.
	Refrigerator(){ // 기본생성자
		pName = "SAM냉장고";
		price = 150;
		bonusPoint = 15;
		
	}
	
}
