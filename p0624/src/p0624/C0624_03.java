package p0624;

public class C0624_03 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		
		change(d); // change 메소드에 주소값을 넘겨줌
		
		System.out.println("d.x : "+d.x);
	}
	
	static void change(Data d) {
		d.x = 1000; // 지역변수
		System.out.println("change x : "+d.x);
	}
}
