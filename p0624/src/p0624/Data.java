package p0624;

public class Data { 
	int x; // 인스턴스 변수
}
class ParameterTest2 {
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = "+d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x); 
		
	}
	static void change(Data d) {
		d.x = 1000;
		System.out.println("chage() : x = "+d.x);
	}
}

