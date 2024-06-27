package p0624;

public class C0624_09 {

	public static void main(String[] args) {

		// 객체선언 후 white,auto,4
		Car c = new Car();
		c.color = "white";
		c.gearType = "auto";
		c.door = 4;
		
		// 객체선언 후 red,auto,5
		Car c2 = new Car("red","auto",5);
		
		
		// 객체선언 후 blue,auto,3
		Car c3 = new Car("blue","auto",3);
		
		
//		Data d = new Data(); // 에러없음
//		Data2 d2 = new Data2(); // 매개변수 없는 기본 생성자가 없어서 에러뜸
//		Data2 d3 = new Data2(10); // 매개변수 1개 있는 생성자  사용
	}
}
