package p0625;

public class C0625_07 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		Ambulance a = new Ambulance();
		Ambulance a2 = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		
		// 다형성 : 부모의 참조변수 자손의 객체를 다루는 것
		// 자손의 참조변수로 조상의 객체를 다루는 것(X)
		// 자손참조변수 = 조상의 객체
//		a2 = (Ambulance) c;
		
		c = a;
		a2 = (Ambulance) c;
		
		
		
		
//		// 형변환 - 자손타입에서 조상타입 : 형변환타입생략 가능
//		a.siren();
//		c2 = a; // Ambulance -> Car
//		c2.drive();
////		c2.siren(); // Car엔 siren 메소드가 없음!
//		
//		a2 = (Ambulance) c2;
//		a2.siren();
//		
		
		
//		c2 = (Car) a; 자손타입인 a를 Car로 형변환하여 c2에 넣어준다. 상위호환
		a2 = (Ambulance) c2; // Car에서는 타입을 정해야/ 하위호환
	
	}

}
