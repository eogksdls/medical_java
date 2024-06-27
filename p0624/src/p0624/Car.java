package p0624;

public class Car {
	static int count  = 0;
	String serial_no;
	String color;
	String gearType;
	int door;
	
	// 초기화 블럭 - 생성자를 호출하기 전에
	// 먼저 실행을 시켜줌.
	
	{
		count += 1;
		this.serial_no = "HD"+String.format("%04d",count);
	}
	
	// 기본생성자 : 보통 많이 사용하는 값을 넣어놓는다.
	Car() {}
//	Car(){
//		// 생성에서 다른 생성자를 호출하는 것은 안된다.
////		Car("white","auto",4);
//		// 따라서 this()를 사용함
//		this("white","auto",4);
////		door = 5; //변경 가능 무조건 this보다 뒤에 와야한다. this는 초기화 역할을 하기 때문
//	} 
	Car(String color){
		this.color = color;
	}
	
	
	// 생성자 특징 (초기화 메소드) 
	// 1. class 이름과 동일하게
	// 2. 매개변수 type 이나 개수가 달라야한다.
	// 3. return 값을 안적으려면 앞에 void 를 적어줘야하지만, 생성자는 필요없다! 
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		serial_no += count;
	}
	
//	void Car2(String c) {} : class 이름과 다르기때문에 생성자가 아니고! 앞에 void를 붙여줘야함
}
